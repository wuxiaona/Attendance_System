package com.lab.Attendance_System.dao.inface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Attendance_System.dao.model.User;

public interface UserInterface extends JpaRepository<User, Integer>{
	//通过姓名来查询
	public List<User> findByuserName(String userName);

}

