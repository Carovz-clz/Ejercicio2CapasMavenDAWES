/**
 * 
 */
package com.carol.negocio;

import java.io.IOException;
import java.util.List;

import com.carol.datos.ConsultaDatos;
import com.carol.dto.Persona;

/**
 * @author carol
 *
 */
public class Negocio {
	
	public  double calculoIMC(String nombre) throws IOException {
		//Usar clase datos
		ConsultaDatos consultaDatos = new ConsultaDatos();
		Persona p = consultaDatos.consultarDatos(nombre); //Datos de la persona con el nombre introducido
		
		return (p.getPeso()/p.getAltura());
	}

}
