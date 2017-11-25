package com.springboot.sam.dao;

import com.springboot.sam.entity.UserInfo;

/**
 * @author sumit
 *
 */
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}