package aeropuerto;

import java.time.LocalDate;

import java.util.List;

public class Vuelo {
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDate fechaHoraSalida;
	private	Aeropuerto arribo;
	private LocalDate fechaHoraArribo;
	private Aerolinea aerolinea;
	private List<Piloto> pilotos;
	private Avion avion;
	private List<Asignacion> pasajeros;

	public Vuelo(String codigo, Aeropuerto salida, LocalDate fechaHrSalida, Aeropuerto arribo, LocalDate fechaHrArribo) {
		codigoVuelo = codigo;
		this.salida = salida;
		fechaHoraSalida=fechaHrSalida;
		this.arribo = arribo;
		fechaHoraArribo = fechaHrArribo;
		
	}
	
	public void setAerolinea(Aerolinea aerolineaAsignada) {
		aerolinea = aerolineaAsignada;
	}
	
	public void setAvion(Avion avionAsignado) {
		avion = avionAsignado;
	}
	
	public void setPilotos(List<Piloto> pilotosAsignados) {
		pilotos = pilotosAsignados;
	}
	
	public Vuelo(String codigo, Aeropuerto salida, LocalDate fechaHrSalida, Aeropuerto arribo, LocalDate fechaHrArribo,
				Aerolinea aerolinea) {
		
		codigoVuelo = codigo;
		this.salida = salida;
		fechaHoraSalida=fechaHrSalida;
		this.arribo = arribo;
		fechaHoraArribo = fechaHrArribo;
		this.aerolinea = aerolinea;
		
	}
	
	public Vuelo(String codigo, Aeropuerto salida, LocalDate fechaHrSalida, Aeropuerto arribo, LocalDate fechaHrArribo,
			Aerolinea aerolinea, Avion avionAsignado, List<Piloto> pilotosAsignados) {
	
	codigoVuelo = codigo;
	this.salida = salida;
	fechaHoraSalida=fechaHrSalida;
	this.arribo = arribo;
	fechaHoraArribo = fechaHrArribo;
	this.aerolinea = aerolinea;
	avion = avionAsignado;
	pilotos = pilotosAsignados;
	}
	
	public void agregarAsignaciones(String codigo, Pasajero pasajero, Asiento asiento) {
		Asignacion nuevaAsignacion = new Asignacion(pasajero, asiento, codigo);
		pasajeros.add(nuevaAsignacion);
	}
	
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	
	public Aeropuerto getAeropuertoSalida() {
		Aeropuerto vuelo = salida;
		return vuelo;
	}
	
	public Aeropuerto getAeropuertoArribo() {
		Aeropuerto vuelo = arribo;
		return vuelo;
	}
	
	public LocalDate getFechaHoraSalida() {
		LocalDate fechaHora = fechaHoraSalida;
		return fechaHora;
	}
	
	public LocalDate getFechaHoraArribo() {
		LocalDate fechaHora = fechaHoraArribo;
		return fechaHora;
	}
	
	public Aerolinea getAerolinea() {
		Aerolinea aerolineaVuelo = aerolinea;
		return aerolineaVuelo;
	}
	
	public Avion getAvion() {
		Avion avionAsignado = avion;
		return avionAsignado;
	}
	
	public List<Piloto> getPilotos() {
		return pilotos;
	}

	public List<Asignacion> getPasajeros() {
		return pasajeros;
	}

}
