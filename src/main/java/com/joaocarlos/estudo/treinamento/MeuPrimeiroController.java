package com.joaocarlos.estudo.treinamento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joaocarlos.estudo.treinamento.di.modelo.Cliente;
import com.joaocarlos.estudo.treinamento.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController");
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente cliente = new Cliente("João", "joao@email.com", "123456789");
		
		ativacaoClienteService.ativar(cliente);
		
		return "olá";
	}
	
}
