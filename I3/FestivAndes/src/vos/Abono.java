package vos;

import java.util.ArrayList;

public class Abono {
	
	int id;
	
	ArrayList<Compra> boletas;

	public ArrayList<Compra> getBoletas() {
		return boletas;
	}

	public void setBoletas(ArrayList<Compra> boletas) {
		this.boletas = boletas;
	}
	
	public int getId(){
		return id;
	}
	
}
