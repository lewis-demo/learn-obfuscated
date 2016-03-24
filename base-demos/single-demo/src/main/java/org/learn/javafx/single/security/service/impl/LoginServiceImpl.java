package org.learn.javafx.single.security.service.impl;

import org.learn.javafx.single.common.constant.StatusEnum;
import org.learn.javafx.single.common.util.NumberUtil;
import org.learn.javafx.single.common.util.StringUtil;
import org.learn.javafx.single.security.dao.IUserDao;
import org.learn.javafx.single.security.dao.impl.UserDaoImpl;
import org.learn.javafx.single.security.domain.SysUser;
import org.learn.javafx.single.security.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
	private IUserDao userDao = new UserDaoImpl();

	@Override
	public SysUser login(String name) throws Exception {
		if (StringUtil.isBlank(name)) {
			return null;
		}
		return userDao.find(name);
	}

	@Override
	public void register(SysUser user) throws Exception {
		userDao.insert(user);
	}

	@Override
	public void disable(String id) throws Exception {
		if (!NumberUtil.isNumber(id)) {
			throw new Exception("id参数错误");
		}

		SysUser user = userDao.find(id);
		user.setStatus(StatusEnum.disable.isValue());
		userDao.udpate(user);
	}

}
