package com.sample;

public class Laudo {
	int numCreaEng;
	boolean conferiEndereco;
	
	public Laudo(){}
	public Laudo(int i,boolean b){
		this.numCreaEng = i;
		this.conferiEndereco = b;
	}
	
	public int getNumCreaEng() {
		return numCreaEng;
	}
	public void setNumCreaEng(int numCreaEng) {
		this.numCreaEng = numCreaEng;
	}
	public boolean isConferiEndereco() {
		return conferiEndereco;
	}
	public void setConferiEndereco(boolean conferiEndereco) {
		this.conferiEndereco = conferiEndereco;
	}
}
