package org.big.service;

import org.big.domain.User;

public interface UserService {
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String loginname,String password);
	int addUser(User user);
	int updateUser(User user);
	void updateUserPassword(String loginname,String password);
}
