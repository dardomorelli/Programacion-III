package aeropuerto;

public class Asignacion {
	private Pasajero pasajero;
	private Asiento asiento;
	private String codigoAsignacion;
	
	public Asignacion(Pasajero pasajeroAsignacion, Asiento asientoAsignacion, String codigoAsignacion) {
		pasajero = pasajeroAsignacion;
		asiento = asientoAsignacion;
		this.codigoAsignacion = codigoAsignacion;
	}
	
	public Pasajero getPasajero() {
		Pasajero pasajeroAsignado = pasajero;
		return pasajeroAsignado;
	}
	
	public Asiento getAsignacion() {
		Asiento asientoAsignado = asiento;
		return asientoAsignado;
	}
	
	public String getCodigoAsignacion() {
		return codigoAsignacion;
	}
	
}


