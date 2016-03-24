package org.learn.javafx.single.security.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.learn.javafx.single.security.dao.IUserDao;
import org.learn.javafx.single.security.domain.SysUser;

public class UserDaoImpl implements IUserDao {
	public static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	@Override
	public SysUser find(Long id) {
		logger.info("find by id...");
		return new SysUser(id, "name" + id, true);
	}

	@Override
	public SysUser find(String name) {
		logger.info("find by name...");
		return new SysUser(0L, name, true);
	}

	@Override
	public List<SysUser> findAll() {
		logger.info("findAll...");
		return null;
	}

	@Override
	public void insert(SysUser user) {
		logger.info("insert...");
	}

	@Override
	public void udpate(SysUser user) {
		logger.info("udpate...");
	}

	@Override
	public void delete(Long id) {
		logger.info("delete by id...");
	}

	@Override
	public void delete(String ids) {
		logger.info("delete by ids...");

		for (String id : ids.split(",")) {
			delete(Long.valueOf(id));
		}
	}
}
