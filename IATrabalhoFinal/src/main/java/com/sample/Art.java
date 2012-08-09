package com.sample;

public class Art {
	int numCreaEng;
	boolean pago;
	
	public Art(){}
	public Art(int i, boolean b){
		this.numCreaEng = i;
		this.pago = b;
	}
	
	public int getNumCreaEng() {
		return numCreaEng;
	}
	public void setNumCreaEng(int numCreaEng) {
		this.numCreaEng = numCreaEng;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
}
