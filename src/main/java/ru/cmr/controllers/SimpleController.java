package ru.cmr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
	@RequestMapping(method = RequestMethod.GET)
	public String testGet(Model model) {
		model.addAttribute("name", "Sergey");
		return "test";
	}
}
