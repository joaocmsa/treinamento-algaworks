package com.joaocarlos.estudo.treinamento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.joaocarlos.estudo.treinamento.di.notificacao.Notificador;
import com.joaocarlos.estudo.treinamento.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
