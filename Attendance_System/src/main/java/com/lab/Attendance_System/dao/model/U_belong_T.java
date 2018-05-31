package com.lab.Attendance_System.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_belong_T")
public class U_belong_T {
	@Id
	@GeneratedValue
	@Column(name="manage_id")
	private Integer manageId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;
	
	
	public Integer getMid(){
		return manageId;
	}
	
	public void setTid(Integer m_id){
		this.manageId=m_id;
	}
	
	 public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }
	 

	 public Team getTeam() {
	     return team;
	 }

	 public void setTeam(Team team) {
	     this.team = team;
	 }
	 

}
