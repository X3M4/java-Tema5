package ejercicio15;

public class Entrenador extends MiembroSeleccionFutbol {
	public String federacion;
	
	public Entrenador(String nombre, int edad, String federacion) {
		super(nombre, edad);
		this.federacion = federacion;
	}
	
	public void setFederacion(String fed) {
		this.federacion = fed;
	}
	
	public String getFederacion() {
		return this.federacion;
	}
	
	@Override
	public void entrenar() {
		System.out.println(super.getNombre() +"<dirige_entranamiento> Entrenador");
	}
	
	@Override
	public void jugarPartido() {
		System.out.println(super.getNombre() +"<dirige_equipo> Entrenador");
	}
	
	public void planificaEntrenamiento() {
		System.out.println(super.getNombre() +"planifica <entrenamiento Entrenador");
	}

}
