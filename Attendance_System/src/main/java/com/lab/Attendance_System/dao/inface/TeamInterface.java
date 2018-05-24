package com.lab.Attendance_System.dao.inface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Attendance_System.dao.model.Team;

public interface TeamInterface extends JpaRepository<Team, Integer>{

}
