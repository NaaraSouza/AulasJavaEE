package br.com.senai.naarasouza.aplication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.naarasouza.model.Numeros;


@SuppressWarnings("serial")
@RequestScoped
@Named("gerador")
public class CadastroBean implements Serializable {
	
	private int quant;
	private int valMini;
	private int valMax;
	
	
	private List<Integer> numeros = new ArrayList<>();
	
	public String gerador(){
		for(int i=0;i<quant; i++) {
			int num=numeros.nextInt(valMax-valMini)+valMini+1;
			numeros.add(num);
		}
		
		
		
		return null;
	}
	
	
		public int getQuant() {
		return quant;
	}



	public void setQuant(int quant) {
		this.quant = quant;
	}



	public int getValMini() {
		return valMini;
	}



	public void setValMini(int valMini) {
		this.valMini = valMini;
	}



	public int getValMax() {
		return valMax;
	}



	public void setValMax(int valMax) {
		this.valMax = valMax;
	}
		
		
		
	
}

	