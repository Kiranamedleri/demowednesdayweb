package com.capgemini.in.demowednesdayweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String GetView()
	{
		return  "home";
	}
	
	@RequestMapping("/mani")
	public String GetViews()
	{
		return  "siva";
	}
}
