package aeropuerto;

import java.time.LocalDate;


//import sun.util.calendar.BaseCalendar.Date;

public class Piloto {
	private Integer idPiloto;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;
		
	public Piloto(Integer id, String apellidoPiloto, String nombresPiloto, String docPiloto, int diaNacimiento, int mesNacimiento, int añoNacimiento) {
		idPiloto = id;
		fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
		apellido = apellidoPiloto;
		nombres = nombresPiloto;
		documento = docPiloto;	
	}
	
	public Integer getId() {
		return idPiloto;
	}
	public String getNombres() {
		return nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDoc() {
		return documento;
	}
	public LocalDate getFechaNacimiento() {
		LocalDate fecha = fechaNacimiento;
		return fecha; 
	}

}
