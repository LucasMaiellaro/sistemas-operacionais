package controller;

import model.Cliente;

public class CompraController {
	
	public static void fazerLogin(Cliente cliente) {
		cliente.setTempoLogin(Math.random() * (2 - 0.5) + 0.5);
		
		if (cliente.getTempoLogin() > 1) {
			System.out.println("Voce nao pode fazer o login, logo nao podera fazer a compra.");
			cliente.setLogged(false);
		}
		
		cliente.setLogged(true);
	}
	
	public static void fazerCompra(Cliente cliente) {	
		if (cliente.isLogged() == false) {
			System.out.println("Voce nao pode fazer o login, logo nao podera fazer a compra.");
			cliente.setComprou(false);
		}
		
		cliente.setTempoCompra(Math.random() * (3 - 1) + 1);
			
		if (cliente.getTempoCompra() > 2.5) {
			System.out.println("Voce nao pode fazer a compra, pois sua sessao expirou.");
			cliente.setComprou(false);
		}
		
		cliente.setQuantidadeIngressos(Math.random() * (4 - 1) + 1);
		cliente.setComprou(true);
	}
	
	

}
