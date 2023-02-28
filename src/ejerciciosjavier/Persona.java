package ejerciciosjavier;

import java.time.*;

public class Persona {

	// 1- agregar atributos.
	private String rut;
	private String nombre;
	private LocalDate fechaNacimiento;

	// 2- Agregar constructor vacio
	public Persona() {
		super();
	}

	// 3- Agregar constructor con atributos.
	public Persona(String rut, String nombre, LocalDate fechaNacimiento) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	// 4- Agregar métodos.
	public void mostrarEdad() {
		
}

	public String getRut() {
		return rut;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
}
