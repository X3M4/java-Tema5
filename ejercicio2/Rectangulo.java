package ejercicio2;

public class Rectangulo {
	private double superficie;
	private double perimetro;
	private boolean esCuadrado;
	private Punto vertice1;
	private Punto vertice2;
	
	public Rectangulo(Punto p1, Punto p2) {
		this.vertice1 = p1;
		this.vertice2 = p2;
		double altura = p2.getY()-p1.getY();
		double base = p2.getX()-p1.getX();
		
		this.superficie = base*altura;
		this.perimetro = 2*(base+altura);
		
		if(altura == base) {
			this.esCuadrado = true;
		}else {
			this.esCuadrado = false;
		}
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public boolean esCuadrado() {
		return esCuadrado;
	}
	
	public Punto getVertice1() {
		double x,y;
		Punto nuevoPunto;
		x = vertice1.getX();
		y = vertice2.getY();
		nuevoPunto = new Punto(x,y);
		return nuevoPunto;
	}
	
	public Punto getVertice2() {
		double x = vertice2.getX();
		double y = vertice2.getY();
		Punto nuevoPunto;
		return nuevoPunto = new Punto(x,y);
	}
}
