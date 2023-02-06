package ejercicio15;

public class Futbolista extends MiembroSeleccionFutbol {
	public int dorsal;
	public String demarcacion;
	
	public Futbolista() {
		super();
	}
	
	public Futbolista(String nombre, int edad, int dorsal, String posicion) {
		super(nombre, edad);
		this.dorsal = dorsal;
		this.demarcacion = posicion;
	}
	
	public void setDorsal(int numero) {
		this.dorsal = numero;
	}
	
	public void serPOsicion(String posicion) {
		this.demarcacion = posicion;
	}
	
	public int getDorsasl() {
		return this.dorsal;
	}
	
	public String getDemarcacion() {
		return this.demarcacion;
	}
	
	@Override
	public void entrenar() {
		System.out.println(super.getNombre() + "<entrenar> Futbolista");
	}
	
	@Override
	public void jugarPartido() {
		System.out.println(super.getNombre() +"<jugar_partido> Futbolista");
	}
	
	public void entrevista() {
		System.out.println(super.getNombre() + "<Entrevista> Futbolista");
	}
	
	
}
