package com.lab.Attendance_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Attendance_System.dao.inface.SignInterface;
import com.lab.Attendance_System.dao.model.Sign;
import com.lab.Attendance_System.dao.model.Team;
import com.lab.Attendance_System.dao.model.User;

@RestController
public class SignController {
	@Autowired
	SignInterface signInterface;
	
	/*
	 * 查询所有签到
	 */
	@GetMapping(value="/signfindAll")
	
	public List<Sign> signList(){
		return signInterface.findAll();
	}
	
	/*
	 * 新增一个签到
	 */
	@GetMapping(value="/signAdd")
	public Sign userrAdd(@RequestParam("sign_time") Long signTime,
			             @RequestParam("sign_code") String signCode,
			             @RequestParam("team_name") Team teamName
			             ){
		Sign sign=new Sign();
		sign.setSignTime(signTime);
		sign.setSignCode(signCode);
		sign.setTeam(teamName);
		return signInterface.save(sign);
	}

}
