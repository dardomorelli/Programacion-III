package aeropuerto;

import java.time.LocalDate;
import java.time.LocalDateTime;

//import sun.util.calendar.BaseCalendar.Date;

public class Piloto {
	private static Integer id;
	private Integer idPiloto;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;
		
	public Piloto( String apellidoPiloto, String nombresPiloto, String docPiloto, int diaNacimiento, int mesNacimiento, int añoNacimiento) {
		fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
		
	}

}
