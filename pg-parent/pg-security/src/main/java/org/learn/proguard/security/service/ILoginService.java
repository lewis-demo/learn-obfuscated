package org.learn.proguard.security.service;

import org.learn.proguard.security.domain.SysUser;

public interface ILoginService {

	public SysUser login(String name);

	public void register(SysUser user);

	public void disable(Long id);

}
