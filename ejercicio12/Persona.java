package ejercicio12;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;

public class Persona implements Imprimible{
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacim;

	// CONSTRUCTORES PARA EL EJERCICIO 6
	public Persona(String nombre, String apellidos, LocalDate fechaNacim) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacim = fechaNacim;
	}

	// Método getNombre
	public String getNombre() {
		return nombre;
	}

	// Método getApellidos
	public String getApellidos() {
		return apellidos;
	}

	// Método getFechaNacim
	public LocalDate getFechaNacim() {
		return this.fechaNacim;
	}

	// Método setNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método setApellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Método setFechaNacim
	public void setFechaNacim(LocalDate fechaNacim) {
		this.fechaNacim = fechaNacim;
	}

	public void mostrar() {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String stringfecha = formatoFecha.format(this.fechaNacim.toString());
		System.out.printf("Nombre: %s\n", this.nombre);
		System.out.printf("Apellidos: %s\n", this.apellidos);
		System.out.printf("Fecha de nacimiento: %s\n", stringfecha);
	}

	@Override
	public String contenidoString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList contenidoArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable contenidoHashTable() {
		Hashtable conte = new Hashtable();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String sFecha = f.format(getFechaNacim());
		conte.put("nombre", this.nombre);
		conte.put("apellidos", this.apellidos);
		conte.put("fecha de nacimiento", sFecha);
		return conte;
	}

}
