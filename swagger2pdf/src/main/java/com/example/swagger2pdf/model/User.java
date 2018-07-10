package com.example.swagger2pdf.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

@ApiModel(value = "User", description = "用户实体类")
public class User {
	
	@ApiModelProperty(value = "唯一主键", dataType = "long")
	private long id;
	
	@Size(min = 1, max = 100)
	@ApiModelProperty(value = "用户名", dataType = "String")
	private String username;
	
	@Size(min = 1, max = 200)
	@ApiModelProperty(value = "名称", dataType = "String")
	private String firstName;
	
	@Size(min = 1, max = 200)
	@ApiModelProperty(value = "姓氏", dataType = "String")
	private String lastName;
	
	@ApiModelProperty(value = "邮箱", dataType = "String")
	private String email;
	
	@ApiModelProperty(value = "密码", dataType = "String")
	private String password;
	
	@ApiModelProperty(value = "手机号", dataType = "String")
	private String phone;
	
	@ApiModelProperty(value = "用户状态", dataType = "int")
	private int userStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

}