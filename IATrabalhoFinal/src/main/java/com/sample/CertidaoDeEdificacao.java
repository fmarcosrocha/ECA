package com.sample;

import java.math.BigDecimal;

public class CertidaoDeEdificacao{
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
}
