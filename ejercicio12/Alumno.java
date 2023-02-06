package ejercicio12;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;

public class Alumno extends Persona {
	protected String grupo;
	protected double notaMedia;

	// Constructor con super
	public Alumno(String nombre, String apellidos, LocalDate fechaNacim, 
			String grupo, double notaMedia) {
		super(nombre, apellidos, fechaNacim);
		this.grupo = grupo;
		this.notaMedia = notaMedia;
	}

	// Método getGrupo
	public String getGrupo() {
		return grupo;
	}

	// Método getNotaMedia
	public double getNotaMedia() {
		return notaMedia;
	}

	// Método setGrupo
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// Método setNotaMedia
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public void mostrar() {
		super.mostrar();
		;
		System.out.printf("Grupo: %s\n", this.grupo);
		System.out.printf("Nota media: %5.2f\n", this.notaMedia);
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
