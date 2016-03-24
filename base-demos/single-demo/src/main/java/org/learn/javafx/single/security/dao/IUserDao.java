package org.learn.javafx.single.security.dao;

import java.util.List;

import org.learn.javafx.single.security.domain.SysUser;

public interface IUserDao {

	public SysUser find(Long id);
	
	public SysUser find(String name);

	public List<SysUser> findAll();

	public void insert(SysUser user);

	public void udpate(SysUser user);

	public void delete(Long id);

	public void delete(String ids);

}
