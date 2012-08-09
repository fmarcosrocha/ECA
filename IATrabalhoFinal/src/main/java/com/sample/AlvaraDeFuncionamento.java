package com.sample;

import java.math.BigDecimal;

public class AlvaraDeFuncionamento{
	boolean consultaPreviaOk;
	String areaDeFuncionamento;
	BigDecimal valorDAM;
	boolean emitida;
	public BigDecimal getValorDAM() {
		return valorDAM;
	}
	public void setValorDAM(BigDecimal valorDAM) {
		this.valorDAM = valorDAM;
	}
	public boolean isEmitida() {
		return this.emitida;
	}
	public void setEmitida(boolean emitida) {
		this.emitida = emitida;
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
