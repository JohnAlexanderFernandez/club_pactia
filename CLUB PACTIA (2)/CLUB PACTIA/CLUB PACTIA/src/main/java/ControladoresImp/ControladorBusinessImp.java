package ControladoresImp;

import Controladores.ControladorSociosBusiness;
import ModeloImp.Club;
import ModeloImp.Socio;

public class ControladorBusinessImp implements ControladorSociosBusiness{
	private Club club;
	@Override
	public void validadorCedula( int cedula) throws Exception {
		for (Socio socio : getClub().getSocios()) {
			if (socio.getCedula()==cedula) {
				throw new Exception("ya existe una socio con esa cedula registrada");
			}
		}
		
	}

	@Override
	public Socio buscarSocio(int cedula) throws Exception {
		for (Socio socio : getClub().getSocios()) {
			if (socio.getCedula()==cedula) {
				return socio;
			}
		}
		throw new Exception("no existe una socio con esa cedula registrada");
	}

	

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

}
