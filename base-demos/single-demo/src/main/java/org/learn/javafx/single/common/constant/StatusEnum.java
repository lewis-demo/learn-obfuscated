package org.learn.javafx.single.common.constant;

public enum StatusEnum {

	active(true), disable(false);

	private boolean value;

	private StatusEnum(boolean value) {
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

}
