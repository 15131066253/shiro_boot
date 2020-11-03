package com.cf.dao;

import com.cf.entity.KubeOperator;

public interface KubeOperatorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KubeOperator record);

    int insertSelective(KubeOperator record);

    KubeOperator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KubeOperator record);

    int updateByPrimaryKey(KubeOperator record);
}