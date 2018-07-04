package aeropuerto;

import java.util.List;

public class Avion {
	private Integer idAvion;
	private String modelo;
	private String matricula;
	private List<Asiento> listaAsientos;
	
	
	public Avion (Integer id, String modelo,String matricula, List<Asiento> listaAsientos) {
		idAvion = id;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos= listaAsientos;
	}
	
	public void agregarAsientos(List<Asiento> asientos) {
		listaAsientos.addAll(asientos);
	}
	
	public void quitarAsientos(List<Asiento> asientos) {
		listaAsientos.removeAll(asientos);
	}
	
	public List<Asiento> getAsientos(){
		return listaAsientos;
	}
	
	public Integer getIdAvion() {
		return idAvion;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
}
