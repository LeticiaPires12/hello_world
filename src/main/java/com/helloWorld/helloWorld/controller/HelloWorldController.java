package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	
	@GetMapping("/bsms")
	public List<String> bsms() {
		List<String> bsms = new ArrayList<String>();
		
		bsms.add("PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades");
		bsms.add("PT - BSM-GM - Mentalidade de Crescimento");
		bsms.add("PT - BSM-GM - Mentalidade de Crescimento");
		bsms.add("PT - BSM-P - Persistência");
		bsms.add("PT - BSM-P - Persistência");
		bsms.add("PT - BSM-PR - Responsabilidade Pessoal");
		bsms.add("PT - BSM-PR - Responsabilidade Pessoal");
		bsms.add("PT - BSM-FO - Orientação ao Futuro");
		bsms.add("PT - BSM-FO - Orientação ao Futuro");
		bsms.add("PT - BSM-C - Comunicação");
		bsms.add("PT - BSM-C - Comunicação");
		bsms.add("PT - BSM-OD - Orientação ao Detalhe");
		bsms.add("PT - BSM-OD - Orientação ao Detalhe");
		bsms.add("PT - BSM-PA - Proatividade");
		bsms.add("PT - BSM-PA - Proatividade");
		bsms.add("PT - BSM-T - Trabalho em Equipe");
		bsms.add("PT - BSM-T - Trabalho em Equipe");
		
		return bsms;
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivos() {
		List<String> objetivos = new ArrayList<String>();
		
		objetivos.add("HTTP status");
		objetivos.add("Consumo de requisições pelo insomnia");
		objetivos.add("Spring Boot");
		objetivos.add("anotações do Spring Boot");
		objetivos.add("Dependências do pom.xml");
		
		return objetivos;

	}
	
}
