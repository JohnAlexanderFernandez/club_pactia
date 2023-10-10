package Controladores;

import ModeloImp.Socio;

public interface ControladorSociosBusiness {
	public void validadorCedula(int cedula) throws Exception;
	public Socio buscarSocio( int cedula) throws Exception;
}
