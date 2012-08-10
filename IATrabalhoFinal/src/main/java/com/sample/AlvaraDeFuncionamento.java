package com.sample;


public class AlvaraDeFuncionamento{
	boolean consultaPreviaOk;
	String areaDeFuncionamento;
	double valorDAM;
	boolean emitido;
	public double getValorDAM() {
		return valorDAM;
	}
	public void setValorDAM(double valorDAM) {
		this.valorDAM = valorDAM;
	}
	public boolean isEmitido() {
		return this.emitido;
	}
	public void setEmitido(boolean emitido) {
		this.emitido = emitido;
	}
	public boolean isConsultaPreviaOk() {
		return this.consultaPreviaOk;
	}
	public void setConsultaPreviaOk(boolean consultaPreviaOk) {
		this.consultaPreviaOk = consultaPreviaOk;
	}
	public String getAreaDeFuncionamento() {
		return this.areaDeFuncionamento;
	}
	public void setAreaDeFuncionamento(String areaDeFuncionamento) {
		this.areaDeFuncionamento = areaDeFuncionamento;
	}
}
