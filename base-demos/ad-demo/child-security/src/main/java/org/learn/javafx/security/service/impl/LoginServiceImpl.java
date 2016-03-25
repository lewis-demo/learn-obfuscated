package org.learn.javafx.security.service.impl;

import org.learn.javafx.common.constant.StatusEnum;
import org.learn.javafx.common.util.StringUtil;
import org.learn.javafx.security.dao.IUserDao;
import org.learn.javafx.security.dao.impl.UserDaoImpl;
import org.learn.javafx.security.domain.SysUser;
import org.learn.javafx.security.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
	private IUserDao userDao = new UserDaoImpl();

	@Override
	public SysUser login(String name) {
		if (StringUtil.isBlank(name)) {
			return null;
		}
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
