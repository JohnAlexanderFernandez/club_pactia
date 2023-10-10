package Principal;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controladores.ControladorMaterialesInput;
import Controladores.ControladorMovimientos;
import Controladores.ControladorSociosBusiness;
import Controladores.ControladorSociosInput;
import ModeloImp.Club;
import ModeloImp.Socio;

public class Principal {
	public static void main(String args[]) {
		try (ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("Contexto.xml")) {
			Scanner lector = new Scanner(System.in);
			Club club = contexto.getBean("Club",Club.class);
			boolean ejecucion = true;
			while (ejecucion) {
				try {
					System.out.println("ingrese 0 para salir");
					System.out.println("ingrese 1 para afiliar socio");
					System.out.println("ingrese 2 para registrar persona autorizada");
					System.out.println("ingrese 3 para pagar factura");
					System.out.println("ingrese 4 para registrar consumo");
					System.out.println("ingrese 5 para aumentar fondos");
					System.out.println("ingrese 6 para eliminar socio");
					System.out.println("ingrese 7 para eliminar persona autorizada");
					int opcion = lector.nextInt();
					switch (opcion) {
					case 0: {
						ejecucion = false;
						lector.close();
						break;
					}
					case 1: {
						ControladorSociosInput controladorInput = contexto.getBean("ControladorInput", ControladorSociosInput.class);
						ControladorSociosBusiness controladorBusiness = contexto.getBean("ControladorBusiness", ControladorSociosBusiness.class);
						System.out.println("ingrese la cedula de la persona");
						int cedula = controladorInput.validarCedula(lector.next());
						System.out.println("ingrese el nombre socio");
						String nombre = controladorInput.validarNombre(lector.next());
						controladorBusiness.validadorCedula(cedula);
						Socio socio = contexto.getBean("Socio",Socio.class);
						socio.setCedula(cedula);
						socio.setNombre(nombre);
						System.out.println("se agrega persona con datos: " + socio.getNombre());
						break;
					}
					case 2: {
						System.out.println("se agrega material con datos: " );
						break;
					}
					case 3: {
						System.out.println("se elimina persona con datos: ");
						break;
					}
					case 4: {
						ControladorMovimientos controladorBusiness = contexto.getBean("ControladorBusiness", ControladorMovimientos.class);
						ControladorSociosInput controladorInputPersona = contexto.getBean("ControladorInput", ControladorSociosInput.class);
						ControladorMaterialesInput controladorInputMaterial = (ControladorMaterialesInput) controladorInputPersona;
						System.out.println("ingrese la cedula de la persona");
						int cedula = controladorInputPersona.validarCedula(lector.next());
						System.out.println("ingrese la identificador de la persona");
						int identificador = controladorInputMaterial.validarIdentificador(lector.next());
						controladorBusiness.realizarPrestamo(cedula, identificador);
						break;
					}
					case 5: {
						ControladorMovimientos controladorBusiness = contexto.getBean("ControladorBusiness", ControladorMovimientos.class);
						ControladorSociosInput controladorInputPersona = contexto.getBean("ControladorInput", ControladorSociosInput.class);
						ControladorMaterialesInput controladorInputMaterial = (ControladorMaterialesInput) controladorInputPersona;
						System.out.println("ingrese la cedula de la persona");
						int cedula = controladorInputPersona.validarCedula(lector.next());
						System.out.println("ingrese la identificador de la persona");
						int identificador = controladorInputMaterial.validarIdentificador(lector.next());
						controladorBusiness.realizarDevolucion(cedula, identificador);
						break;
					}
					case 6: {
						System.out.println("se ha incrementado la cantidad al material :" + "Texto de factura");			
					}case 7: {
						System.out.println("crear logica para eliminar socio");
						break;
					}
					default: {
						System.out.println("opcion no valida");
					}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
