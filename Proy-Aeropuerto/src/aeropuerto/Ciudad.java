package aeropuerto;

public class Ciudad {
	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;
	private static Integer id=0;
	
	public Ciudad (String nombreCiudad, String codigoPostal) {
		++id;
		idCiudad=id;
		nombre=nombreCiudad;
		this.codigoPostal=codigoPostal;	
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;	
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal=codigoPostal;	
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
