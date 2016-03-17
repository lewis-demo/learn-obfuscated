package org.learn.proguard.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class StringUtil {
	public static final Logger logger = Logger.getLogger(StringUtil.class);

	public static boolean isBlank(String str) {
		return StringUtils.isBlank(str);
	}

	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}

}
