package com.sample;


public class Terreno {
	
	boolean deEsquina;
	double metragem;
	Imovel construcao;
	
	public Terreno(){}
	
	/*
	 * construtor do terreno sem atributo imovel
	 * */
	public Terreno(boolean b,double m){
		this.deEsquina = b;
		this.metragem = m;
	}
	
	public boolean isDeEsquina() {
		return deEsquina;
	}
	public void setDeEsquina(boolean deEsquina) {
		this.deEsquina = deEsquina;
	}
	public double getMetragem() {
		return metragem;
	}
	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
	public Imovel getConstrucao() {
		return construcao;
	}
	public void setConstrucao(Imovel contrucao) {
		this.construcao = contrucao;
	}
}
