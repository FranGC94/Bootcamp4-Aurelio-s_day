package com.nttdata.bootcamp.main;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		Person p1=new Person("Juan", "Cruz", 34);
		Flux<Person> fluxp1=Flux.just(p1).delayElements(Duration.ofSeconds(5));
		
		return fluxp1;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		Person p1=new Person("Pepillo", "palote", 79);
		Flux<Person> fluxp1=Flux.just(p1).delayElements(Duration.ofSeconds(5));
		
		return fluxp1;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		Person p1=new Person("Juan", "Cruz", 34);
		Flux<Person> fluxp1=Flux.just(p1).delayElements(Duration.ofSeconds(5));
		
		return fluxp1;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		Person p1=new Person("Ruben", "ElPregunton", 37);
		Flux<Person> fluxp1=Flux.just(p1).delayElements(Duration.ofSeconds(5));
		
		return fluxp1;
	}
	
	
	
}
