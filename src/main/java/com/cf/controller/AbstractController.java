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
	//修改AbstractController 
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}
	//haha

	//修改AbstractController
	protected SysUserEntity getUser2() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
