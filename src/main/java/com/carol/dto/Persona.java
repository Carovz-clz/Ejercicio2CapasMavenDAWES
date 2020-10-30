/**
 * 
 */
package com.carol.dto;

/**
 * @author carol
 *
 */
public class Persona {
	private String nombre;
	private double peso;
	private double altura;
	
	
	/**
	 * @param nombre
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, double peso, double altura) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
