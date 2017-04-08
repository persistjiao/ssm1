package com.persist.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.persist.model.User;
import com.persist.service.IUserService;

//作为controller
@Controller
@RequestMapping("/user")	//url的组成之一
public class UserController {

	//初始化一个service
	@Resource
	private IUserService userService;
	
	//定义一个方法，给其设置RequestMapping
	@RequestMapping("/showUser")
	private String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("###############"+userId);
		User user = this.userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";
	}
}



