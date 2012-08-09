package com.sample;

import java.math.BigDecimal;

public class AlvaraDeFuncionamento{
	BigDecimal valorDAM;
	boolean emitida;
	public BigDecimal getValorDAM() {
		return valorDAM;
	}
	public void setValorDAM(BigDecimal valorDAM) {
		this.valorDAM = valorDAM;
	}
	public boolean isEmitida() {
		return emitida;
	}
	public void setEmitida(boolean emitida) {
		this.emitida = emitida;
	}
	public boolean isConsultaPreviaOk() {
		return consultaPreviaOk;
	}
	public void setConsultaPreviaOk(boolean consultaPreviaOk) {
		this.consultaPreviaOk = consultaPreviaOk;
	}
	public String getAreaDeFuncionamento() {
		return areaDeFuncionamento;
	}
	public void setAreaDeFuncionamento(String areaDeFuncionamento) {
		this.areaDeFuncionamento = areaDeFuncionamento;
	}
	boolean consultaPreviaOk;
	String areaDeFuncionamento;
}
