package com.lab.Attendance_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Attendance_System.dao.inface.UserInterface;
import com.lab.Attendance_System.dao.model.User;

@RestController
public class UserController {
	@Autowired
	UserInterface userInterface;
	
	/*
	 * 查询所有成员列表
	 */
	@GetMapping(value="/userfindAll")
	
	public List<User> userList(){
		return userInterface.findAll();
	}
	
	//通过名字来查询，不支持中文名字
	@GetMapping(value="/userfind/{userName}")
	public List<User> userListByUserName(@PathVariable("userName") String name){
		return userInterface.findByuserName(name);
			
	}

	
	/*
	 * 新增一个成员
	 */
	@GetMapping(value="/userAdd")
	public User userrAdd(@RequestParam("user_name") String userName,
			             @RequestParam("tel") String tel,
			             @RequestParam("user_password") String userPassword,
			             @RequestParam("is_user")boolean is_user){
		User user=new User();
		user.setUserName(userName);
		user.setTel(tel);
		user.setUserPassword(userPassword);
		user.setIs(is_user);
		return userInterface.save(user);
	}
	
	/*
	 * 根据id查询一个user
	 */
	@GetMapping(value="/userfindOne/{userId}")
	public User userFindOne(@PathVariable("userId") Integer id){
		return userInterface.findOne(id);
		
	}
	
	/*
	 * 删除
	 */
	@DeleteMapping(value="/userDelet/{userId}")
	public void userDelet(@PathVariable("userId") Integer id){
		userInterface.delete(id);
	}
	
	

}