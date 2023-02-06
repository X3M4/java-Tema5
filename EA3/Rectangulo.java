package EA3;

public class Rectangulo extends Figura2D {
	public int perimetro;
	public int area;
	
	
	public Rectangulo(int x, int y, int xfinal, int yfinal) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.area(xfinal, yfinal);
		this.perimetro(xfinal, yfinal);
	}

	@Override
	public void perimetro(int xfinal, int yfinal) {
		// TODO Auto-generated method stub
		int base = xfinal - super.getX();
		int altura = yfinal - super.getY();
		this.perimetro = 2*base + 2*altura;
	}

	@Override
	public void area(int xfinal, int yfinal) {
		// TODO Auto-generated method stub
		int x = xfinal - super.getX();
		int y = yfinal - super.getY();
		this.area = x*y;
	}

}
