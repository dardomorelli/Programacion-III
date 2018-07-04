package aeropuerto;

public class Asiento {
	private Integer idAsiento;
	private String numeroAsiento;
	
	public Asiento(Integer id, String numero) {
		idAsiento = id;
		numeroAsiento = numero;
	}
	
	public Integer getIdAsiento() {
		return idAsiento;
	}
	
	public String getNumeroAsiento() {
		return numeroAsiento;
	}
}
