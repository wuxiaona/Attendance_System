package com.lab.Attendance_System.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.lab.Attendance_System.dao.model.User;

@Service
public class UserMessage {
private List<User> user;
	
	//初始化一些user
		@PostConstruct
		private void Message() {
			user = new ArrayList<User>();
			User user1 = new User("wuxiaona", "password:1");
			User user2 = new User("zhongying", "password:2");
			
			
			user.add(user1);
			user.add(user2);
			
		}
	
	public List<User> find(String username){
		List<User> result = user.stream()//组合流
				.filter(a -> a.getUserName().equals(username))
				.collect(Collectors.toList());
		//把相同的用户名提取到新的List里
		return result;
	}
	

}
