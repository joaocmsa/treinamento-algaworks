package com.joaocarlos.estudo.treinamento.di.notificacao;

import com.joaocarlos.estudo.treinamento.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}