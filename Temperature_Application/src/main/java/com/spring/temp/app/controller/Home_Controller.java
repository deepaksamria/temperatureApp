package com.spring.temp.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.temp.app.model.Root;
import com.spring.temp.app.services.Temp_Service;

@Controller
public class Home_Controller {
	@Autowired
	public Temp_Service ts;
	
	@GetMapping("/")
	public String Home(Model m) throws Throwable {
		
		Root data = ts.getDelhiData();
		m.addAttribute("data", data);
		return "homepage";
	}
	@PostMapping("/search")
	public String Search(@RequestParam("city") String city,Model m, HttpSession session) throws Exception {
		Root data = ts.getSearchData(city);
		if(data==null) {
			session.setAttribute("message", "Please enter a valid city, rest please find Capital Weather report!!!");
			Root delhi = ts.getDelhiData();
			m.addAttribute("data", delhi);
			return "search";
		}else
			m.addAttribute("data", data);
			return "search";
	}
}
