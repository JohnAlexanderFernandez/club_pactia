package ModeloImp;

import java.util.ArrayList;

public class Club {
	private ArrayList<Socio> socios;
	private ArrayList<Factura> facturas;
	
	public Club(){}
	
	public void setsocios(ArrayList<Socio> socios) {
		this.socios = socios;
	}
	
	public ArrayList<Socio> getSocios() {
		return socios;
	}

	public void setSocios(ArrayList<Socio> socios) {
		this.socios = socios;
	}

	public ArrayList<Factura> getFaturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
}

