package aeropuerto;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombre;
	private static Integer id=0;
	
	public Aerolinea(String nombreAerolinea) {
		++id;
		nombre=nombreAerolinea;
		idAerolinea=id;
	}
	
	public void setNombreAerolinea (String nombreAerolinea) {
		nombre=nombreAerolinea;
	}
	
	public Integer getIdAerolinea () {
		return idAerolinea;
	}
	
	public String getNombreAerolinea() {
		return nombre;
	}

}
