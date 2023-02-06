package EA6;

public abstract class Mascota {
	private int num_patas;
	private String nombre;
	private String voz;
	public double peso;
	
	public Mascota(String nombre, int patas, String voz, double peso) {
		this.setnumPatas(patas);
		this.setNombre(nombre);
		this.setVoz(voz);
	}
	
	public void setnumPatas(int patas) {
		this.num_patas = patas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setVoz(String voz) {
		this.voz = voz;
	}
	
	public int getPatas() {
		return this.num_patas;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getVoz() {
		return this.voz;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void come(double cantidad) {
		this.peso += cantidad;
	}
	
	public boolean juega(double minutos) {
		this.peso -= minutos/2;
		if(this.getPeso() <= 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("PERRO\nNombre: %s\nPatas: %d\nPeso: %1.2f\nVoz: %s\n", 
				this.nombre, this.num_patas, this.peso, this.voz);
	}
	
}

