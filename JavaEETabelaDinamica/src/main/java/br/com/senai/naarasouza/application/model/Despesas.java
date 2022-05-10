package br.com.senai.naarasouza.application.model;

import java.util.Date;

public class Despesas {
	
	private String data; // As letras do tipos Primitivos são maiúscula, pq elas aceitam valores nulos.
	private String descricao;
	private Double valor;
	private boolean edit;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	
	
	
	
	
	
	
	

}
