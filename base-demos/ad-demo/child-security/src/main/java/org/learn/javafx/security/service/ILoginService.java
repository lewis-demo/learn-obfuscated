package org.learn.javafx.security.service;

import org.learn.javafx.security.domain.SysUser;

public interface ILoginService {

	public SysUser login(String name);

	public void register(SysUser user);

	public void disable(Long id);

}
