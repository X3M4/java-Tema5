package EA3;

public class Circulo extends Figura2D{
	public double radio;
	public double area;
	public double perimetro;

	public Circulo(int x, int y, int xfinal, int yfinal) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.setRadio(xfinal, yfinal);;
	}

	public void setRadio(int x, int y) {
		int base = x - super.getX();
		int altura = y - super.getY();
		this.radio = Math.hypot(base, altura);
	}
	
	public double getRadio() {
		return this.radio;
	}

	@Override
	public void perimetro(int x, int y) {
		// TODO Auto-generated method stub
		this.perimetro = 2*(Math.PI*this.getRadio());
	}

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		this.area = Math.PI*(Math.pow(this.getRadio(), 2));
	}

}
