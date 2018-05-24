package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue
	private Integer t_id;
	private String t_name;
	private Integer t_num;

	public Team(){	
	}
	
	@JoinColumn(name="user_id")
	@ManyToOne
	private User user;
	
	public Integer getTid(){
		return t_id;
	}
	
	public void setTid(Integer id){
		this.t_id=id;
	}
	
	public String getTname(){
		return t_name;
	}
	
	public void setTname(String name){
		this.t_name=name;
	}
	
	public Integer getTnum(){
		return t_num;
	}
	
	public void setTnum(Integer num){
		this.t_num=num;
	}
	
	 public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }

}
