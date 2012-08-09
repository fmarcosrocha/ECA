package com.sample;


public class Terreno {
	
	boolean deEsquina;
	double metragem;
	Imovel contrucao;
	
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
	public Imovel getContrucao() {
		return contrucao;
	}
	public void setContrucao(Imovel contrucao) {
		this.contrucao = contrucao;
	}
}
