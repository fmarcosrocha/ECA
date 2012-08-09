package com.sample;

public class Pessoa {
	String nome;
	int cpf_cnpj;
	boolean cndOk;
	
	public Pessoa(){}
	
	public Pessoa(String string, int i, boolean b) {
		this.nome=string;
		this.cndOk = b;
		this.cpf_cnpj = i;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(int cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public boolean isCndOk() {
		return cndOk;
	}
	public void setCndOk(boolean cndOk) {
		this.cndOk = cndOk;
	}
}
