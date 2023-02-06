package EA3;

public abstract class Figura2D {
	public int x;
	public int y;
	
	public Figura2D(int x, int y) {
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int x) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public abstract void perimetro(int x, int y);
	
	public abstract void area(int x, int y);
}
