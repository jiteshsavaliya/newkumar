package com.newkumar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String test(){
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(HttpServletRequest req){
		/*if(req.getParameter("uname").equals("newkumar")&&req.getParameter("password").equals("newkumar"))
		{
			return "index-boot";
		}
		else
		{
		return null;
		}*/
		return "index-boot";
		
	}
}
