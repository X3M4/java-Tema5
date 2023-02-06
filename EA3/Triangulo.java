package EA3;

public class Triangulo extends Figura2D {
	public double area;
	public double perimetro;

	public Triangulo(int x, int y, int xfinal, int yfinal) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.area(xfinal, yfinal);
		this.perimetro(xfinal, yfinal);
	}

	@Override
	public void perimetro(int x, int y) {
		// TODO Auto-generated method stub
		int base = x - super.getX();
		int altura = y - super.getY();
		this.perimetro = 2*altura + base;
	}

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		int base = x - super.getX();
		int altura = y - super.getY();
		this.perimetro = (base*altura)/2;
	}
	
}
