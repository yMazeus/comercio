package com.itb.inf2cm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {
	
	@GetMapping("/listar")
	public String testProduto() {
		System.out.println("Lista de Produtos");
		
		return "produtos"; // Retorna o nome do template
	}

}

