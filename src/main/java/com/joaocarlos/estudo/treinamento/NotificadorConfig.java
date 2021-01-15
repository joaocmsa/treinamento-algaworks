package com.joaocarlos.estudo.treinamento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.joaocarlos.estudo.treinamento.di.notificacao.NotificadorEmail;

@Configuration
public class NotificadorConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.joaodesenvolvimento.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
}
