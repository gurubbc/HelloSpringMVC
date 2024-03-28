package com.cfgbank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String displayHello() {
		// we must return the name of the view (not response) , name of the jsp
		return "hello"; // hello.jsp must be present in /WEB-INF 
		
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String displayWelcome() {
		// we must return the name of the view (not response) , name of the jsp
		return "welcome"; // hello.jsp must be present in /WEB-INF 
		
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String showToday() {
		// we must return the name of the view (not response) , name of the jsp
		return "today"; // today.jsp must be present in /WEB-INF 
		
	}

}
