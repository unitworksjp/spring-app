package com.example.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InjectionController {

	@Autowired
	User user;

	@GetMapping("/injection")
	public String greeting(Model model) {
		model.addAttribute("user", this.user);
		return "injection";
	}
}
