package com.cf.dao;

import com.cf.entity.KubePod;

public interface KubePodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KubePod record);

    int insertSelective(KubePod record);

    KubePod selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KubePod record);

    int updateByPrimaryKey(KubePod record);
}