package aeropuerto;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombre;
	
	public Aerolinea(Integer id, String nombreAerolinea) {
		nombre=nombreAerolinea;
		idAerolinea=id;
	}
	
	public Integer getIdAerolinea () {
		return idAerolinea;
	}
	
	public String getNombreAerolinea() {
		return nombre;
	}

}
