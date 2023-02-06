package ejercicio4;

public class Rectangulo {
	private double superficie;
	private double perimetro;
	private boolean esCuadrado;
	private Punto vertice1;
	private Punto vertice2;
	
	public Rectangulo(Punto p1, Punto p2) {
		this.vertice1 = new Punto(p1.getX(), p1.getY());
		this.vertice2 = new Punto(p2.getX(), p2.getY());
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
	
	public Rectangulo() {
		vertice1 = new Punto(0,0);
		vertice2 = new Punto(1,1);
	}
	
	public Rectangulo(double x1, double y1, double x2, double y2) {
		vertice1 = new Punto(x1, y1);
		vertice2 = new Punto(x2, y2);
	}
	
	public Rectangulo(double base, double altura) {
		vertice1 = new Punto(0,0);
		vertice2 = new Punto(base, altura);
	}
	//EL EJERCICIO 4 ES SOLO ESTE PUNTO
	public Rectangulo(Rectangulo r1) {
		vertice1 = new Punto(r1.vertice1.getX(), r1.vertice1.getY());
		vertice2 = new Punto(r1.vertice2.getX(), r1.vertice2.getY());
	}
	//FIN DEL EJERCICIO 4
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
