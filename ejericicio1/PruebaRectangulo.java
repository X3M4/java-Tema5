package ejericicio1;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(10,10);
		Punto p2 = new Punto(20,20);
		
		Rectangulo r1 = new Rectangulo(p1, p2);
		System.out.printf("Área = %1.2f\nSuperficie = %1.2f\nCuadrado = %b", 
				r1.getSuperficie(), r1.getPerimetro(), r1.esCuadrado());
	}

}
