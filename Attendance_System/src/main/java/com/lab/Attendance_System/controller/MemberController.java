//package com.lab.Attendance_System.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lab.Attendance_System.dao.inface.MemberInterface;
//import com.lab.Attendance_System.dao.model.Member;
//
//@RestController
//public class MemberController {
//	@Autowired
//	MemberInterface memberInterface;
//	
//	/*
//	 * 查询所有成员列表
//	 */
//	@GetMapping(value="/member")
//	
//	public List<Member> memberList(){
//		return memberInterface.findAll();
//	}
//	
//	/*
//	 * 新增一个成员
//	 */
//	@PostMapping(value="/member")
//	public Member memberAdd(@RequestParam("name") String name){
//		Member member=new Member();
//		member.setName(name);
//		return memberInterface.save(member);
//	}
//	
//
//}
