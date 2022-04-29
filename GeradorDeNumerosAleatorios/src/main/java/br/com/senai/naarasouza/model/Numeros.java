package br.com.senai.naarasouza.model;

public class Numeros {
	
	private int num;

	public static final Numeros[]NUMEROS;
	
	static {
		
	NUMEROS= new Numeros[5];
	
	NUMEROS[0] = new Numeros(1);
	NUMEROS[1] = new Numeros(2);
	NUMEROS[2] = new Numeros(3);
	NUMEROS[3] = new Numeros(4);
	NUMEROS[4] = new Numeros(5);
	
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public Numeros(int num) {
		this.num=num;
	}
	

}
