package com.itb.tcc.cafeteria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.cafeteria.model.Produto;

@Controller
@RequestMapping("/cafeteria/produtos")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	@GetMapping("/listar")
	public String listarProdutos(Model model) {

		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("café");
		p1.setCodigoBarras("hghgsg");
		p1.setDescricao("quente");
		p1.setPreco(12.50);
		
		
		Produto p2 = new Produto();
		p2.setId(21l);
		p2.setNome("Ren");
		p2.setCodigoBarras("515151");
		p2.setDescricao("Dyvo");
		p2.setPreco(12.50);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
	}
}
