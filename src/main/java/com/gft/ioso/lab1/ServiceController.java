package com.gft.ioso.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {
	
	@RequestMapping(path = "/")
	public String root() {
		return "hello";
	}
}