package ModeloImp;

import java.util.ArrayList;

public class Socio {
	private String nombre;
	private int cedula;
	private String tipo;
	private double fondos;
	private ArrayList<Persona> autorizadas;
	private ArrayList<Factura> facturas;
	private int limiteAutorizadas = 10;

	//constructor
	public Socio(String nombre, int cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Persona> getAutorizadas() {
		return autorizadas;
	}

	public boolean setAutorizadas(Persona autorizada) {
		if(this.autorizadas.size() <= limiteAutorizadas){
			this.autorizadas.add(autorizada);
			return true;
		}else{
			System.out.println("Error: no tine capacidad para ingresar pesonas autorizadas.");
			return false;
		}
	}
	
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public boolean setFacturas(Factura factura) {
		if(this.facturas.size() <= 20 && this.fondos >= 0){
			this.facturas.add(factura);
			return true;
		}else{
			System.out.println("Error: no tine capacidad para ingresar facturas o fondos insuficientes");
			return false;
		}
	}

	public int getLimiteAutorizadas() {
		return this.limiteAutorizadas;
	}

	public void setLimiteAutorizadas(int LimiteAutorizadas) {
		this.limiteAutorizadas = LimiteAutorizadas;
	}
	
	public String mostrarDatos() {
		return "\n nombre: " + this.getNombre();
			// +"\n cedula: " + this.getCedula()
			// +"\n tipo: " + this.gettipo()
			// +"\n limite de personas autorizadas: " + this.getLimiteAutorizadas();
	}
}
