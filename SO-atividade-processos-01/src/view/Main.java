package view;

import controller.RedesController;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		RedesController redes = new RedesController();
		
		int choose = 0;

		System.out.print("Lucas Rufino Maiellaro - RA: 1110482012003\n"); 
		System.out.print("Exercicios-Processos - Exercicio 01");
		
		do {
			choose = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para saber seu Adaptador Ethernet e IPv4. \nDigite 2 para ver o seu tempo médio de ping. \nDigite 0 para encerrar o programa", JOptionPane.QUESTION_MESSAGE));
			
			switch(choose) {
			case 1: redes.ip(System.getProperty("os.name")); break;
			case 2: redes.ping(System.getProperty("os.name")); break;
			}
		} while(choose != 0);
	}

}