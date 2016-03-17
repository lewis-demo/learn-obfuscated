package org.learn.proguard.security.service.impl;

import org.learn.proguard.common.constant.StatusEnum;
import org.learn.proguard.security.dao.IUserDao;
import org.learn.proguard.security.dao.impl.UserDaoImpl;
import org.learn.proguard.security.domain.SysUser;
import org.learn.proguard.security.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
	private IUserDao userDao = new UserDaoImpl();

	@Override
	public SysUser login(String name) {
		return userDao.find(name);
	}

	@Override
	public void register(SysUser user) {
		userDao.insert(user);
	}

	@Override
	public void disable(Long id) {
		SysUser user = userDao.find(id);
		user.setStatus(StatusEnum.disable.isValue());
		userDao.udpate(user);
	}
}
