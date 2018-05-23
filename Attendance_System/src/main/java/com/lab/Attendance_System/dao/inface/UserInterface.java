package com.lab.Attendance_System.dao.inface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Attendance_System.dao.model.User;

public interface UserInterface extends JpaRepository<User, Integer>{

}
