package test;

import java.time.LocalDate;
import java.util.Collection;

public class Pedido {

	private String nombre;
	private String domicilio;
	private double importe;
	private LocalDate fechaEntrega;
	private Collection<Pizza> pizzas;
	public Pedido(String nomApellido, String direccion, double importe, LocalDate fechaEntrega, Pizza pedido) {
		nombre=nomApellido;
		domicilio=direccion;
		this.importe= importe;
		this.fechaEntrega=fechaEntrega;
		pizzas.add(pedido);
	}
	public Collection<Pizza> getPizzas(){
		
		return pizzas;

	}
	public void agregarPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	public String getBase() {
		if(pizzas.size() == 0)
			return "";
		
		return pizzas.
	}
	
}
