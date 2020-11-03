package com.cf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cf.entity.SysUserEntity;
import com.cf.utils.ShiroUtils;

/**
 * Controller公共组件
 * 
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	//修改 本地修改
	//修改 远程修改
    //zi
	//远程再次修改哟
	//本地再次修改哟
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
