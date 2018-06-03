package com.lab.Attendance_System.dao.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue
	@Column(name="team_id")
	private Integer tId;
	
	@Column(name="team_name")
	private String tName;
	
	@Column(name="team_num")
	private Integer tNum;

	public Team(){	
	}
	//多对一
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="team")
	private Set<U_belong_T> U_belong_T =new HashSet<U_belong_T>();
	
	@OneToMany(mappedBy="team")
	private Set<Sign> sign =new HashSet<Sign>();
	
	public Integer getTid(){
		return tId;
	}
	
	public void setTid(Integer id){
		this.tId=id;
	}
	
	public String getTname(){
		return tName;
	}
	
	public void setTname(String name){
		this.tName=name;
	}
	
	public Integer getTnum(){
		return tNum;
	}
	
	public void setTnum(Integer num){
		this.tNum=num;
	}
	
	 public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }

}
