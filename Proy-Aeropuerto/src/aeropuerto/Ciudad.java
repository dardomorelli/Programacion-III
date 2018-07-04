package aeropuerto;

public class Ciudad {
	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;

	public Ciudad (Integer id, String nombreCiudad, String codigoPostalCiudad) {
		idCiudad = id;
		nombre=nombreCiudad;
		codigoPostal=codigoPostalCiudad;	
	}
	
	public Integer getIdCiudad() {
		return idCiudad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
}
