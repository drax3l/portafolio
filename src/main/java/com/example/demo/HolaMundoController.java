package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundoController {
	@GetMapping({"/"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola mundo este es mi proyecto en Spring Boot");
		return "index";
	}
	@GetMapping({"/about"})
	public String index2(Model model) {
		model.addAttribute("titulo", "Hola mundo este es mi proyecto en Spring Boot");
		return "about";
	}
	@GetMapping({"/contact"})
	public String index3(Model model) {
		model.addAttribute("titulo", "Hola mundo este es mi proyecto en Spring Boot");
		return "contact";
	}
	

}
