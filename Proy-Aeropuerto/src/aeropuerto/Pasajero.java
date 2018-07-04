package aeropuerto;

public class Pasajero {
	private Integer idPasajero;
	private String cUIL;
	private String nombres;
	private String apellido;
	private String telefono;
	
	public Pasajero(Integer id, String cuil, String nombres, String apellido, String telefono) {
		idPasajero=id;
		cUIL=cuil;
		this.nombres=nombres;
		this.apellido=apellido;
		this.telefono=telefono;
	}
	
	public Integer getIdPasajero() {
		return idPasajero;
	}
	public String getCUIL() {
		return cUIL;
	}
	public String getNombres() {
		return nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
}


