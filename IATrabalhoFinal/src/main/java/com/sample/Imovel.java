package com.sample;


public class Imovel {
	
	int numero;
	boolean totalmenteConstruida;
	boolean iniciada;
	TipoImovel tipoImovel;
	
	double metragemConstrucao;
	double afastamentoLateralEsquerdo;
	double afastamentoLateralDireito;
	double afastamentoFrente;
	double afastamentoFundo;
	
	boolean ladoDireitoParaRua;
	
	Art art;
	Laudo laudo;
	
	AlvaraDeConstrucao alvara;
	AlvaraDeFuncionamento alvaraFunc;
	CertidaoDeEdificacao certidao;
	Habitese habitese;
	
	/*
	 * construtor do processo sem art, laudo,alvara,certidao,alavara de funcionamento e habitese
	 * */
	public Imovel(int i,boolean inic, boolean totalC, TipoImovel t, double metragem, double d, double e, double fr, double fu, boolean ladoD){
		this.iniciada = inic;
		this.totalmenteConstruida = totalC;
		this.ladoDireitoParaRua=ladoD;
		this.numero=i;
		this.tipoImovel = t;
		this.metragemConstrucao = metragem;
		this.afastamentoLateralDireito = d;
		this.afastamentoLateralEsquerdo = e;
		this.afastamentoFundo = fu;
		this.afastamentoFrente = fr;
	}
	
	public Imovel(){}
	
	public boolean isLadoDireitoParaRua() {
		return this.ladoDireitoParaRua;
	}
	public void setLadoDireitoParaRua(boolean ladoDireitoParaRua) {
		this.ladoDireitoParaRua = ladoDireitoParaRua;
	}
	public Art getArt() {
		return this.art;
	}
	public void setArt(Art art) {
		this.art = art;
	}
	public Laudo getLaudo() {
		return this.laudo;
	}
	public void setLaudo(Laudo laudo) {
		this.laudo = laudo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isTotalmenteConstruida() {
		return this.totalmenteConstruida;
	}
	public void setTotalmenteConstruida(boolean totalmenteConstruida) {
		this.totalmenteConstruida = totalmenteConstruida;
	}
	public TipoImovel getTipoImovel() {
		return this.tipoImovel;
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public double getMetragemConstrucao() {
		return this.metragemConstrucao;
	}
	public void setMetragemConstrucao(double metragemConstrucao) {
		this.metragemConstrucao = metragemConstrucao;
	}
	public double getAfastamentoLateralEsquerdo() {
		return this.afastamentoLateralEsquerdo;
	}
	public void setAfastamentoLateralEsquerdo(double afastamentoLateralEsquerdo) {
		this.afastamentoLateralEsquerdo = afastamentoLateralEsquerdo;
	}
	public double getAfastamentoLateralDireito() {
		return this.afastamentoLateralDireito;
	}
	public void setAfastamentoLateralDireito(double afastamentoLateralDireito) {
		this.afastamentoLateralDireito = afastamentoLateralDireito;
	}
	public double getAfastamentoFrente() {
		return this.afastamentoFrente;
	}
	public void setAfastamentoFrente(double afastamentoFrente) {
		this.afastamentoFrente = afastamentoFrente;
	}
	public double getAfastamentoFundo() {
		return this.afastamentoFundo;
	}
	public void setAfastamentoFundo(double afastamentoFundo) {
		this.afastamentoFundo = afastamentoFundo;
	}
	public AlvaraDeConstrucao getAlvara() {
		return this.alvara;
	}
	public void setAlvara(AlvaraDeConstrucao alvara) {
		this.alvara = alvara;
	}
	public AlvaraDeFuncionamento getAlvaraFunc() {
		return this.alvaraFunc;
	}
	public void setAlvaraFunc(AlvaraDeFuncionamento alvaraFunc) {
		this.alvaraFunc = alvaraFunc;
	}
	public CertidaoDeEdificacao getCertidao() {
		return this.certidao;
	}
	public void setCertidao(CertidaoDeEdificacao certidao) {
		this.certidao = certidao;
	}
	public Habitese getHabitese() {
		return this.habitese;
	}
	public void setHabitese(Habitese habitese) {
		this.habitese = habitese;
	}
	
}
