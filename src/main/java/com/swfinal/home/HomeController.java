package com.swfinal.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping("/home")
	public String home(HttpServletRequest request, Model model, HttpSession session) {
	    log.info("메인페이지 요청");
	    
	    String jsessionid= (String) session.getId();
	    log.info("jsessionid : {}", jsessionid);

	    return "home"; 
	}
}
