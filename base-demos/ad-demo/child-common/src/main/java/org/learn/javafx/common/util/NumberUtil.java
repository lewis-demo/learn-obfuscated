package org.learn.javafx.common.util;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;

public class NumberUtil {
	public static final Logger logger = Logger.getLogger(NumberUtil.class);

	public static int toInt(String str) {
		return NumberUtils.toInt(str);
	}

	public static double toDouble(String str) {
		return NumberUtils.toDouble(str);
	}

}
