package ejercicio7;

import java.time.LocalDate;
import java.util.Scanner;

public class Profesor extends Persona {
	String especialidad;
	double salario;
	
	//EJERCICIO 7
	public Profesor(String nombre, String apellidos, LocalDate fechaNacim, 
			String especialidad, double salario) {
		
		super(nombre, apellidos, fechaNacim);
		super.setFechaNacim(fechaNacim);
		this.especialidad = especialidad;
		this.salario = salario;
	}
	
 @Override
	public void setFechaNacim(LocalDate fechaNacim) {
		this.setFechaNacim(fechaNacim);
	}

	public void setFechaNacim() {
		System.out.println("escribe la fecha de nacimiento");
		Scanner sc = new Scanner(System.in);
		this.setFechaNacim(LocalDate.parse(sc.nextLine()));
		this.setFechaNacim(fechaNacim);
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

 @Override
	public void mostrar() {
		super.mostrar(); // Llama al método “mostrar” de la superclase
		System.out.printf("Especialidad: %s\n", this.especialidad);
		System.out.printf("Salario: %7.2f euros\n", this.salario);
	}

}
