package ejerciciosjavier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudiante1 = new Estudiante("17.267.806-8", "Juanito", LocalDate.of(1989, 8, 12),
				new ArrayList<String>(Arrays.asList("mal alumno", "buen alumno")), new float[] {5.5f, 6.0f, 1.2f, 4.5f, 4.0f});
		Estudiante estudiante2 = new Estudiante("18.467.804-8", "Pepito", LocalDate.of(1999, 7, 14),
				new ArrayList<String>(Arrays.asList("le pega a los compañeros", "se saca los mocos")), new float[] {6.5f, 4.0f, 3.2f, 4.8f, 6.0f});
		Estudiante estudiante3 = new Estudiante("16.445.804-8", "Laurito", LocalDate.of(1978, 2, 24),
				new ArrayList<String>(Arrays.asList("vende sustancias ilicitas", "consume cocaina en clases")), new float[] {4.5f, 4.6f, 3.8f, 4.6f, 3.0f});
		
		
		System.out.println("Estudiante 1");
		System.out.println(estudiante1.getRut());
		System.out.println(estudiante1.getNombre());
		System.out.println(estudiante1.getFechaNacimiento());
		estudiante1.mostrarAnotaciones();
		System.out.println(estudiante1.mostrarPromedio());
		
		System.out.println("Estudiante 2");
		System.out.println(estudiante2.getRut());
		System.out.println(estudiante2.getNombre());
		System.out.println(estudiante2.getFechaNacimiento());
		estudiante2.mostrarAnotaciones();
		System.out.println(estudiante2.mostrarPromedio());
		
		System.out.println("Estudiante 3");
		System.out.println(estudiante3.getRut());
		System.out.println(estudiante3.getNombre());
		System.out.println(estudiante3.getFechaNacimiento());
		estudiante3.mostrarAnotaciones();
		System.out.println(estudiante3.mostrarPromedio());
	}
}
