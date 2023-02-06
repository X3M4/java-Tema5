package ejercicio15;

public abstract class MiembroSeleccionFutbol implements Seleccionable{
	
	String nombre;
	int edad;
	
	public MiembroSeleccionFutbol() {
		
	}
	
	public MiembroSeleccionFutbol(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	@Override
	public void concentrarse() {
		System.out.println(this.nombre + "<concentrarse> MiembroSeleccion");
	}
	
	@Override
	public void viajar() {
		System.out.println(this.nombre + "<viajar> MiembroSeleccion");

	}
	
	@Override
	public void entrenar() {
		System.out.println(this.nombre + "<entrenar> MiembroSeleccion");

	}
	
	@Override
	public void jugarPartido() {
		System.out.println(this.nombre + "<jugar_partido> MiembroSeleccion");

	}
}
