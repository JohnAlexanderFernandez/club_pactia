package ModeloImp;

import java.util.ArrayList;
public class Persona {
	private int cedula;
	private String nombre;
	private ArrayList<Factura> facturas;
	
	public Persona(int cedula, String nombre) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public boolean setFacturas(Factura factura) {
		if(this.facturas.size() <= 20){
			this.facturas.add(factura);
			return true;
		}else{
			System.out.println("Error: no tine capacidad para ingresar facturas o fondos insuficientes");
			return false;
		}
	}

	public String mostrarDatos() {
		return "\n nombre " + nombre +
				"\n cedula " + cedula ;
	}
}
