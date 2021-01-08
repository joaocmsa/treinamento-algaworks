package com.joaocarlos.estudo.treinamento.di.service;

import org.springframework.stereotype.Component;

import com.joaocarlos.estudo.treinamento.di.modelo.Cliente;
import com.joaocarlos.estudo.treinamento.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
 