package ejerciciosjavier;

import java.time.LocalDate;
import java.util.ArrayList;

//1- agregar atributos.
public class Estudiante extends Persona {
	private ArrayList<String> anotaciones = new ArrayList<String>();
	private float[] notas;

	// 2- Agregar constructor vacio
	public Estudiante() {
		super();
	}

	// 3- Agregar constructor con atributos.
	public Estudiante(String rut, String nombre, LocalDate fechaNacimiento, ArrayList<String> anotaciones,
			float[] notas) {
		super(rut, nombre, fechaNacimiento);
		this.anotaciones = anotaciones;
		this.notas = notas;
	}
		

	// 4- Agregar métodos.
	public float mostrarPromedio() {
		float promedio = 0f;
		float suma = 0f;
		
		//Mostrar por pantalla las promedio.
		for (float nota: notas) {
		suma = suma + nota;
		}
		promedio = suma / notas.length;
					
	//Agregar valor si no es void.
		return promedio;
		}
					
	public void mostrarAnotaciones() {
		// Mostrar por pantalla las antoaciones.
		for (String anotacion : anotaciones) {
			System.out.print(anotacion);
			
					}
			}

	public ArrayList<String> getAnotaciones() {
		return anotaciones;
	}

	public float[] getNotas() {
		return notas;
	}

}
