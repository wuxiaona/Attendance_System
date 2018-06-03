package com.lab.Attendance_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lab.Attendance_System.dao.inface.TeamInterface;

import com.lab.Attendance_System.dao.model.Team;
import com.lab.Attendance_System.dao.model.User;


@RestController
public class TeamController {

	@Autowired
	TeamInterface teamInterface;
	
	/**
	 * 查询所有团队列表
	 */
	@GetMapping(value="/teamfindAll")
	
	public List<Team> userList(){
		return teamInterface.findAll();
	}
	
	/**
	 * 通过team名字查询（不支持中文）
	 * @param userName
	 * @return
	 */
	@GetMapping(value="/team/{teamName}")
	public List<Team> userByUserName(@PathVariable("teamName") String teamName){
		return teamInterface.findBytName(teamName);
		
	}
	
	
	@GetMapping(value = "/teamAdd")
	public Team userAdd(@RequestParam("team_name") String tName,
                        @RequestParam("team_num") Integer tNum,
                        @RequestParam("user_id") User userId){
		Team team = new Team();
		
		team.settName(tName);
		team.settNum(tNum);
		team.setUser(userId);
		
		return teamInterface.save(team);
		
	}
	
}
