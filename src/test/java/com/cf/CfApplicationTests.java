package com.cf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cf.dao.KubeContainerMapper;
import com.cf.dao.KubeOperatorMapper;
import com.cf.dao.KubePodMapper;
import com.cf.entity.KubeContainer;
import com.cf.entity.KubeOperator;
import com.cf.entity.KubePod;
import com.mysql.cj.xdevapi.JsonArray;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CfApplicationTests {
    @Autowired
    private KubeOperatorMapper operatorMapper;
    @Autowired
    private KubePodMapper podMapper;
    @Autowired
    private KubeContainerMapper containerMapper;

    @Test
    public void test() throws IOException {
        File file = new File("D:/k8s.txt");
        String str = FileUtils.readFileToString(file, "gbk");
        JSONObject json = JSON.parseObject(str);
        JSONObject total = (JSONObject)json.get("_");
        JSONObject data = (JSONObject)total.get("data");
        JSONArray array = (JSONArray)data.get("services");
        List<KubeOperator> operators = new ArrayList<>();
        for(int i = 0;i<array.size();i++){
            JSONObject oper = (JSONObject)array.get(i);
            //namespace
            KubeOperator kubeOperator = getKubeOperator(oper);
            operators.add(kubeOperator);
            operatorMapper.insert(kubeOperator);
            //pod
            JsonArray podArray = (JsonArray)oper.get("pods");
            List<KubePod> pods = new ArrayList<>();
            for (int j = 0;j<podArray.size();j++) {
                JSONObject pod = (JSONObject)array.get(j);
                KubePod kubePod = getKubePod(pod, kubeOperator.getId());
                pods.add(kubePod);
                podMapper.insert(kubePod);
                //container
                JsonArray containerArray = (JsonArray)pod.get("containers");
                List<KubeContainer> kubeContainers = new ArrayList<>();
                for(int k = 0;k<containerArray.size();k++){
                    JSONObject container = (JSONObject)array.get(k);
                    KubeContainer kubeContainer = getKubeContainer(container, kubePod.getId());
                    kubeContainers.add(kubeContainer);
                    containerMapper.insert(kubeContainer);
                }
            }
        }
    }
    private KubeContainer getKubeContainer(JSONObject json, Integer pId){
        KubeContainer container = new KubeContainer();
        container.setImage(json.getString("image"));
        container.setImagePullPolicy(json.getString("image_pull_policy"));
        container.setName(json.getString("name"));
        container.setPortsContainerPort(json.getString("ports_container_port"));
        container.setPortsName(json.getString("ports_name"));
        container.setPortsProtocol(json.getString("ports_protocol"));
        container.setLimitsCpu(json.getString("limits_cpu"));
        container.setLimitsMemory(json.getString("limits_memory"));
        container.setRequestsCpu(json.getString("requests_cpu"));
        container.setLimitsMemory( json.getString("requests_memory"));
        container.setTerminationMessagePath(json.getString("termination_message_path"));
        container.setTerminationMessagePolicy(json.getString("termination_message_policy"));
        container.setVolumeMountsName(json.getString("volume_mounts_name"));
        container.setVolumeMountsMountPath(json.getString("volume_mounts_mount_path"));
        container.setVolumeMountsReadOnly(json.getString("volume_mounts_read_only"));
        container.setPid(pId);
        return container;
    }
    private KubePod getKubePod(JSONObject json, Integer oId){
        KubePod kubePod = new KubePod();
        kubePod.setPodName(json.getString("pod_name"));
        kubePod.setDnsPolicy(json.getString("dns_policy"));
        kubePod.setRestartPolicy(json.getString("restart_policy"));
        kubePod.setSchedulerName(json.getString("scheduler_name"));
        kubePod.setServiceAccount(json.getString("service_account"));
        kubePod.setPodIp(json.getString("pod_ip"));
        kubePod.setNodeInfoName(json.getString("node_info_name"));
        kubePod.setNodeInfoIp(json.getString("node_info_ip"));
        kubePod.setState(json.getString("state"));
        kubePod.setStartTime(new Date());
        kubePod.setOid(oId);
        return kubePod;

    }

    private KubeOperator getKubeOperator(JSONObject json){
        KubeOperator operator = new KubeOperator();
        operator.setSvcName(json.getString("svc_name"));
        operator.setNamespace(json.getString("namespace"));
        operator.setClusterip(json.getString("clusterip"));
        operator.setType(json.getString("type"));
        JSONObject node_selector = json.getJSONObject("node_selector");
        if(node_selector!=null){
            operator.setNodeSelectorAppnode(node_selector.toJSONString());
        }
        operator.setReplicas(json.getString("replicas"));
        JSONObject strategy = json.getJSONObject("strategy");
        operator.setStrategyType(strategy.getString("type"));
        operator.setStrategyMaxSurge(strategy.getString("max_surge"));
        operator.setStrategyMaxUnavailable(strategy.getString("max_unavailable"));
        return operator;
    }
}
