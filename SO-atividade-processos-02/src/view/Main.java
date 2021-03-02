package view;

import javax.swing.JOptionPane;

import controller.ProcessosController;

public class Main {

	public static void main(String[] args) {
		ProcessosController procController = new ProcessosController();
		
		int choose = 0;

		System.out.print("Lucas Rufino Maiellaro - RA: 1110482012003\n"); 
		System.out.print("Exercicios_Processos - Exercicio 02");
		
		do {
			choose = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para ver os processos ativos. \nDigite 2 para utilizar o PID de um processo para mata-lo. \nDigite 3 para usar o nome de um processo para mata-lo. \nDigite 0 para encerrar o programa ", JOptionPane.QUESTION_MESSAGE));
			
			switch(choose) {
			case 1: procController.ver(procController.identiSO()); break;
			case 2: procController.matarPID(procController.identiSO(),Integer.parseInt(JOptionPane.showInputDialog("Digite o PID do processo que você deseja matar."))); break;
			case 3: procController.matarNome(procController.identiSO(),JOptionPane.showInputDialog("Digite o nome do processo que você deseja matar.")); break;
			}
		} while(choose != 0);
	}

}