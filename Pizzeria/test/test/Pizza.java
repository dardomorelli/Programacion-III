package test;

import java.util.Collection;
import java.util.LinkedList;

public class Pizza {
	private Integer id;
	private String nombre;
	private double precio;
	private Base base;
	private Collection<Cubierta> cubiertas;
	
	public Pizza(String nombre, double precio, Base base,Collection<Cubierta> cubiertas) {
		this.nombre=nombre;
		this.precio=precio;
		this.base=base;
		//this.cubiertas=cubiertas;
		this.cubiertas.addAll(cubiertas);
	}


}
