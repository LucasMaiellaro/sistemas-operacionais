package model;

import controller.CompraController;

public class Cliente extends Thread{

    private int id;
    private double quantidadeIngressos;
    private double tempoLogin;
    private double tempoCompra;
    private boolean isLogged;
    private boolean comprou;

    public void run() {
    	try {
    		sleep((long) tempoLogin);
    	} catch (InterruptedException ex) {
    		ex.printStackTrace();	
    	}
    	
    	try {
    		sleep((long) tempoCompra);
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
    public double getQuantidadeIngressos() {
        return quantidadeIngressos;
    }
    public void setQuantidadeIngressos(double quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
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
