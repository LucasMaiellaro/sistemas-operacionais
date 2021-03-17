package controller;

import model.Cliente;

public class CompraController {
	
	public static double fazerLogin() {
		Cliente cliente = new Cliente();
		cliente.setTempoLogin(Math.random() * (2 - 0.5) + 0.5);
		
		if (cliente.getTempoLogin() > 1) {
			System.out.println("Voce nao pode fazer o login, logo nao podera fazer a compra.");
			cliente.setLogged(false);
		}
		
		cliente.setLogged(true);
		return cliente.getTempoLogin();
	}
	
	public static double fazerCompra() {
		Cliente cliente = new Cliente();
		
		if (cliente.isLogged() == false) {
			System.out.println("Voce nao pode fazer o login, logo nao podera fazer a compra.");
			cliente.setComprou(false);
		}
		
		cliente.setTempoCompra(Math.random() * (3 - 1) + 1);
			
		if (cliente.getTempoCompra() > 2.5) {
			System.out.println("Voce nao pode fazer a compra, pois sua sessao expirou.");
			cliente.setComprou(false);
		}
		
		cliente.setComprou(true);
		return cliente.getTempoCompra();	
	}
	
	

}
