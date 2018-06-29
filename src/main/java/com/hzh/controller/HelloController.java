package com.hzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hzh.entity.User;
import com.hzh.mapper.UserDao;

//@RestController  @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
@Controller
public class HelloController {
	
	@Autowired
	private UserDao userDao;

	@GetMapping("/")
	public ModelAndView index() { 
		ModelAndView modelAndView=new ModelAndView();
		User user =new User();
		user.setName("Rose");
		modelAndView.addObject("name", "黄振衡");
		modelAndView.addObject("user", user);
		modelAndView.addObject("userList", userDao.queryUserList());
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}