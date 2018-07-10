package com.example.swagger2pdf.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.swagger2pdf.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/users", tags = "user api", description = "操作用户相关接口")
public class UserController {

	@RequestMapping(value = "/createUser", method = POST)
	@ApiOperation(value = "创建用户", notes = "根据传进来的参数创建一个用户", response = User.class)
	@ResponseBody
	public User createUser(
			@RequestBody @ApiParam(value = "创建的用户对象", required = true) User user) {
		return user;
	}

	@RequestMapping(value = "/updateUser", method = POST)
	@ApiOperation(value = "更新用户", notes = "根据传进来的参数更新用户的信息", response = String.class)
	@ResponseBody
	public String updateUser(
			@RequestBody @ApiParam(value = "更新的用户对象", required = true) User user) {
		return "SUCCESS";
	}

	@RequestMapping(value = "/deleteUser/{username}", method = GET)
	@ApiOperation(value = "删除用户", notes = "根据用户名称删除用户", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = "删除失败") })
	@ResponseBody
	public String deleteUser(
			@ApiParam(value = "要删除用户的用户名称", required = true) 
			@PathVariable("username") String username) {
		return "SUCCESS";

	}

	@RequestMapping(value = "/getUserByName/{username}", method = GET)
	@ApiOperation(value = "根据用户名称查询用户", notes = "根据用户名称查询用户")
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "查询成功"),
		@ApiResponse(code = 404, message = "查询失败")
	})
	@ResponseBody
	public List<User> getUserByName(
			@ApiParam(value = "要查询用户的用户名称", required = true) 
			@PathVariable("username") String username) {
		List<User> userList = new ArrayList<>();
		userList.add(new User());
		return userList;
	}
	
	@RequestMapping(value = "/getUserById/{id}", method = GET)
	@ApiOperation(value = "根据用户id查询用户", notes = "根据用户id查询用户", response = User.class)
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "查询成功"),
		@ApiResponse(code = 404, message = "查询失败")
	})
	@ResponseBody
	public User getUserById(
			@ApiParam(value = "要查询用户的用户id", required = true) 
			@PathVariable("id") String id) {
		return new User();
	}

}
