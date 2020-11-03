package com.cf.dao;

import com.cf.entity.KubeContainer;

public interface KubeContainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KubeContainer record);

    int insertSelective(KubeContainer record);

    KubeContainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KubeContainer record);

    int updateByPrimaryKey(KubeContainer record);
}