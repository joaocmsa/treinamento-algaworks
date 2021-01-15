package com.joaocarlos.estudo.treinamento.di.notificacao;

import com.joaocarlos.estudo.treinamento.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
		
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public String notificar(Cliente cliente, String mensagem) {
		
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		return "Notificando " + cliente.getNome() +" através de e-mail " +cliente.getEmail()+ 
				" usando SMTP" + this.hostServidorSMTP + "! "+ mensagem;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
	
}
 