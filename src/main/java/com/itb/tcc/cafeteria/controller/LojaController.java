package com.itb.tcc.cafeteria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cafeteria/produtos")
public class LojaController {

	@GetMapping("/listar")
	public String listarProdutos() {

		return "produtos";
	}
}
