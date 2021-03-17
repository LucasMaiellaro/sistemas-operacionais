package view;

import model.Cliente;

public class Main {
	
	public static void main(String args[]) {
		int ingressos = 100;
		
		for (int i = 0; i < 300; i++) {
			Cliente cliente = new Cliente();
			
			cliente.run();
			
			if (cliente.isLogged() == false || cliente.comprou() == false) {
				System.out.println("Sua sessao foi invalidada, voce nao podera comprar o ingresso");
				continue;			
			}
			
			ingressos = ingressos - 1;
		}
	}
	
}
