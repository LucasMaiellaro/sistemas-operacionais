package model;

import controller.CompraController;

public class Cliente extends Thread{

    private int id;
    private double quantidadeIngresso;
    private double tempoLogin;
    private double tempoCompra;
    private boolean isLogged;
    private boolean comprou;

    public void run() {
    	try {
    		sleep((long) CompraController.fazerLogin());
    	} catch (InterruptedException ex) {
    		ex.printStackTrace();	
    	}
    	
    	try {
    		sleep((long) CompraController.fazerCompra());
    	} catch (InterruptedException ex) {
    		ex.printStackTrace();
    	}
  
    }

    public int getIdCliente() {
        return id;
    }
    public void setIdCliente(int id) {
        this.id = id;
    }
    public double getQtdIngressos() {
        return quantidadeIngresso;
    }
    public void setQtdIngressos(double quantidadeIngresso) {
        this.quantidadeIngresso = quantidadeIngresso;
    }
    public double getTempoLogin() {
        return tempoLogin;
    }
    public void setTempoLogin(double tempoLogin) {
        this.tempoLogin = tempoLogin;
    }
    public double getTempoCompra() {
        return tempoCompra;
    }
    public void setTempoCompra(double tempoCompra) {
        this.tempoCompra = tempoCompra;
    }
	public boolean isLogged() {
		return isLogged;
	}
	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
	public boolean comprou() {
		return comprou;
	}
	public void setComprou(boolean comprou) {
		this.comprou = comprou;
	}

}
