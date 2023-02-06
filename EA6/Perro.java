package EA6;

public class Perro extends Mascota {
	
	public String color;
	
	public Perro(String nombre, int patas, String voz, double peso, String color) {
		super(nombre, patas, voz, peso);
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	@Override
	public boolean juega(double minutos) {
		super.come(1);
		super.peso -= minutos/2;
		if(super.getPeso() <= 0) {
			return false;
		}
		return true;
		
	}
	
	
	
	
	

}
