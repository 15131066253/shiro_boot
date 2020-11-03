package com.cf.controller;

import com.cf.entity.ScheduleJobEntity;
import com.cf.service.ScheduleJobService;
import com.cf.utils.PageUtils;
import com.cf.utils.Query;
import com.cf.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys/docker")
public class DokcerController {

    @Autowired
    private ScheduleJobService scheduleJobService;

    /**
     * 定时任务列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schedule:list")
    public R list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<ScheduleJobEntity> jobList = scheduleJobService.queryList(query);
        int total = scheduleJobService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(jobList, total, query.getLimit(), query.getPage());
        //修改哟
        return R.ok().put("page", pageUtil);
    }
}
