package com.nttdata.bootcamp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import reactor.core.publisher.Flux;

@Controller
public class PersonServiceController {

	@Autowired
	PersonService PersonService;
	
	@GetMapping("/personList")
	public String personList(Model model) {
		
		Flux <Person> flux= PersonService.allPersons();
		model.addAttribute("personlist", flux);
		return "personList";
	}
}
