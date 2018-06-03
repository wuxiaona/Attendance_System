package com.lab.Attendance_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.Attendance_System.dao.inface.TaskInterface;
import com.lab.Attendance_System.dao.model.Task;
import com.lab.Attendance_System.dao.model.Team;
import com.lab.Attendance_System.dao.model.User;

@RestController
public class TaskController {
	@Autowired
	TaskInterface taskInterface;
	
	/**
	 * 查询所有任务列表
	 */
	@GetMapping(value="/taskfindAll")
	
	public List<Task> taskList(){
		return taskInterface.findAll();
	}
	
	
	/**
	 * 新建任务
	 */
	@GetMapping(value = "/taskAdd")
	public Task taskAdd(@RequestParam("task_desc") String task_desc,
                        @RequestParam("user_id") User userId){
		Task task = new Task();
		
		task.setDesc(task_desc);
		task.setUser(userId);
		
		return taskInterface.save(task);
		
	}
	

}
