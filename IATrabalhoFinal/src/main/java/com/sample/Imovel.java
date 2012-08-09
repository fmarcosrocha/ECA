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
		return ladoDireitoParaRua;
	}
	public void setLadoDireitoParaRua(boolean ladoDireitoParaRua) {
		this.ladoDireitoParaRua = ladoDireitoParaRua;
	}
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
	public double getAfastamentoFrente() {
		return afastamentoFrente;
	}
	public void setAfastamentoFrente(double afastamentoFrente) {
		this.afastamentoFrente = afastamentoFrente;
	}
	public double getAfastamentoFundo() {
		return afastamentoFundo;
	}
	public void setAfastamentoFundo(double afastamentoFundo) {
		this.afastamentoFundo = afastamentoFundo;
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
