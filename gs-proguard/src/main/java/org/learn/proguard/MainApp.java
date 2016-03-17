package org.learn.proguard;

import org.apache.log4j.Logger;
import org.learn.proguard.security.service.ILoginService;
import org.learn.proguard.security.service.impl.LoginServiceImpl;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static final Logger logger = Logger.getLogger(MainApp.class);
	public static final ILoginService loginSrv = new LoginServiceImpl();

	public static void main(String[] args) {
		logger.info("Hello World!");
		logger.info(loginSrv.login("张三"));
	}

}
