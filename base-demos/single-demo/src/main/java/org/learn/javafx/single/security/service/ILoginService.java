package org.learn.javafx.single.security.service;

import org.learn.javafx.single.security.domain.SysUser;

public interface ILoginService {

	public SysUser login(String name) throws Exception;

	public void register(SysUser user) throws Exception;

	public void disable(String id) throws Exception;

}
