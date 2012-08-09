package com.sample;


public class Imovel {
	
	int numero;
	boolean totalmenteConstruida;
	TipoImovel tipoImovel;
	
	double metragemConstrucao;
	double afastamentoLateralEsquerdo;
	double afastamentoLateralDireito;
	double afastamentoLateralFrente;
	double afastamentoLateralFundo;
	
	Art art;
	Laudo laudo;
	
	AlvaraDeConstrucao alvara;
	AlvaraDeFuncionamento alvaraFunc;
	CertidaoDeEdificacao certidao;
	Habitese habitese;
	
	/*
	 * construtor do processo sem art, laudo,alvara,certidao,alavara de funcionamento e habitese
	 * */
	public Imovel(int i, boolean b, TipoImovel t, double d, double e, double f, double g, double h){
		this.numero=i;
		this.tipoImovel = t;
		this.metragemConstrucao = d;
		this.afastamentoLateralDireito = f;
		this.afastamentoLateralEsquerdo = e;
		this.afastamentoLateralFundo = h;
		this.afastamentoLateralFrente = g;
	}
		
	
	public Imovel(){}
	
	public Art getArt() {
		return art;
	}
	public void setArt(Art art) {
		this.art = art;
	}
	public Laudo getLaudo() {
		return laudo;
	}
	public void setLaudo(Laudo laudo) {
		this.laudo = laudo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isTotalmenteConstruida() {
		return totalmenteConstruida;
	}
	public void setTotalmenteConstruida(boolean totalmenteConstruida) {
		this.totalmenteConstruida = totalmenteConstruida;
	}
	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public double getMetragemConstrucao() {
		return metragemConstrucao;
	}
	public void setMetragemConstrucao(double metragemConstrucao) {
		this.metragemConstrucao = metragemConstrucao;
	}
	public double getAfastamentoLateralEsquerdo() {
		return afastamentoLateralEsquerdo;
	}
	public void setAfastamentoLateralEsquerdo(double afastamentoLateralEsquerdo) {
		this.afastamentoLateralEsquerdo = afastamentoLateralEsquerdo;
	}
	public double getAfastamentoLateralDireito() {
		return afastamentoLateralDireito;
	}
	public void setAfastamentoLateralDireito(double afastamentoLateralDireito) {
		this.afastamentoLateralDireito = afastamentoLateralDireito;
	}
	public double getAfastamentoLateralFrente() {
		return afastamentoLateralFrente;
	}
	public void setAfastamentoLateralFrente(double afastamentoLateralFrente) {
		this.afastamentoLateralFrente = afastamentoLateralFrente;
	}
	public double getAfastamentoLateralFundo() {
		return afastamentoLateralFundo;
	}
	public void setAfastamentoLateralFundo(double afastamentoLateralFundo) {
		this.afastamentoLateralFundo = afastamentoLateralFundo;
	}
	public AlvaraDeConstrucao getAlvara() {
		return alvara;
	}
	public void setAlvara(AlvaraDeConstrucao alvara) {
		this.alvara = alvara;
	}
	public AlvaraDeFuncionamento getAlvaraFunc() {
		return alvaraFunc;
	}
	public void setAlvaraFunc(AlvaraDeFuncionamento alvaraFunc) {
		this.alvaraFunc = alvaraFunc;
	}
	public CertidaoDeEdificacao getCertidao() {
		return certidao;
	}
	public void setCertidao(CertidaoDeEdificacao certidao) {
		this.certidao = certidao;
	}
	public Habitese getHabitese() {
		return habitese;
	}
	public void setHabitese(Habitese habitese) {
		this.habitese = habitese;
	}
	
}
