package com.springboot.sam.dao;
import com.springboot.sam.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}