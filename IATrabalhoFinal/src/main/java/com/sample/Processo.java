package com.sample;

public class Processo {
	int numeroProcesso;
	Pessoa requerente;
	Terreno terreno;
	SituacaoProcesso situacao;
	String justificativa;
	
	public Processo(int i){
		this.numeroProcesso = i;
		this.situacao = SituacaoProcesso.EM_ANDAMENTO;
	}
	
	public int getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(int numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public Pessoa getRequerente() {
		return requerente;
	}
	public void setRequerente(Pessoa requerente) {
		this.requerente = requerente;
	}
	public Terreno getTerreno() {
		return terreno;
	}
	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}
	public SituacaoProcesso getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoProcesso situacao) {
		this.situacao = situacao;
	}
	public String getJustficativa() {
		return justificativa;
	}
	public void setJustficativa(String justficativa) {
		this.justificativa = justficativa;
	}
}
