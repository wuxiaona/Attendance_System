package com.lab.Attendance_System.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complete_task")
public class Complete_task {
	@Id
	@GeneratedValue
	@Column(name="com_task_id")
	private Integer comtaskId;
	
	//多对一
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="task_id")
	private Task task;
		
	public Integer getCtid(){
		return comtaskId;
	}
	public void setCsid(Integer comtaskId){
		this.comtaskId=comtaskId;
	}
	
	 public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }

	 public Task getTask() {
	     return task;
	 }

	 public void setTask(Task task) {
	     this.task = task;
	 }
}
