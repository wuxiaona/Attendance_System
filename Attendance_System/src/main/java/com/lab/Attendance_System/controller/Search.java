package com.lab.Attendance_System.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Attendance_System.dao.model.User;


@RestController
public class Search {
	
	UserMessage userService;
	
	@Autowired
	public void setUserService(UserMessage userService) {
		this.userService = userService;
	}
	
	@PostMapping("/aaaa")
	public ResponseEntity<AjaxResponse> ResultViaAjax(@Valid @RequestBody SearchName search){
		AjaxResponse result = new AjaxResponse();
		
		
		List<User> users = userService.find(search.getUsername());
		if(users.isEmpty()) {
			result.setMsg("没有找到");
		}else {
			result.setMsg("success");
		}
		result.setResult(users);
		
		return ResponseEntity.ok(result);
	}

}
