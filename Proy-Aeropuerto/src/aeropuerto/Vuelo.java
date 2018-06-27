package aeropuerto;

import java.time.LocalDate;
import java.util.Collection;

public class Vuelo {
	private String codigVuelo;
	private Aeropuerto salida;
	private LocalDate fechaHoraSalida;
	private	Aeropuerto arribo;
	private LocalDate fechaHoraArribo;
	private Aerolinea aerolinea;
	private Collection<Piloto> pilotos;
	private Avion avion;
	private Collection<Asignacion> pasajeros;

}
