package org.learn.javafx.security.domain;

public class SysUser {
	private Long id;
	private String name;
	private boolean status;

	public SysUser() {
		super();
	}

	public SysUser(Long id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}
