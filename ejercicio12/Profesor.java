package ejercicio12;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;

public class Profesor extends Persona {
	String especialidad;
	double salario;
	
	//EJERCICIO 6
	public Profesor(String nombre, String apellidos, LocalDate fechaNacim, 
			String especialidad, double salario) {
		super(nombre, apellidos, fechaNacim);
		this.especialidad = especialidad;
		this.salario = salario;
	}

	// Método getEspecialidad
	public String getEspecialidad() {
		return especialidad;
	}

	// Método getSalario
	public double getSalario() {
		return salario;
	}

	// Método setSalario
	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método setEspecialidad
	public void setESpecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void mostrar() {
		super.mostrar(); // Llama al método “mostrar” de la superclase
		System.out.printf("Especialidad: %s\n", this.especialidad);
		System.out.printf("Salario: %7.2f euros\n", this.salario);
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
	//EJERCICIO 12
	@Override
	public Hashtable contenidoHashTable() {
		Hashtable conte = new Hashtable();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String sFecha = f.format(getFechaNacim());
		conte.put("nombre", this.nombre);
		conte.put("apellidos", this.apellidos);
		conte.put("fecha de nacimiento", sFecha);
		conte.put("especialidad", this.especialidad);
		conte.put("salario", this.salario);
		return conte;
	}

}
