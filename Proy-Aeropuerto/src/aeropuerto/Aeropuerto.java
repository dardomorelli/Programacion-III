package aeropuerto;

public class Aeropuerto {
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad ciudad;
	private String codigo;
	
	
	public Aeropuerto (Integer id, String nombreAeropuerto, Ciudad ciudad, String codigoAeropuerto) {
		nombre = nombreAeropuerto;
		codigo = codigoAeropuerto;
		this.ciudad=ciudad;
		idAeropuerto = id;
			
	}
	public Integer getId() {
		return idAeropuerto;
	}
	public String getNombre() {
		return nombre;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public String getCodigo() {
		return codigo;
	}
}
