package com.joaocarlos.estudo.treinamento.di.service;

import com.joaocarlos.estudo.treinamento.di.modelo.Cliente;
import com.joaocarlos.estudo.treinamento.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public String ativar(Cliente cliente) {
		cliente.ativar();
		
		return notificador.notificar(cliente,  " Seu cadastro no sistema está ativo!");
	}
}
 