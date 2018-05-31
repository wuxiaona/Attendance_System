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
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue
	@Column(name="task_id")
	private Integer taskId;
	
	@Column(name="task_desc")
	private String taskDesc;//任务描述）
	
	//多对一
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
    
	//一对多
	@OneToMany(mappedBy="task")
	private Set<Complete_task> Complete_task=new HashSet<Complete_task>();

	public Integer getTkid(){
		return taskId;
	}
	
	public void setTkid(Integer taskId){
		this.taskId=taskId;
	}
	
	public String getDesc(){
		return taskDesc;
	}
	public void setDesc(String taskDesc){
		this.taskDesc=taskDesc;
	}
	
	public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }

}
