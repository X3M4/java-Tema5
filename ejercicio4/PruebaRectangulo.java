package ejercicio4;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(0,5);
		Punto p2 = new Punto(3,10);
		
		Rectangulo r1 = new Rectangulo(p1, p2);
		System.out.printf("Área = %1.2f\nSuperficie = %1.2f\nCuadrado = %b\n", 
				r1.getSuperficie(), r1.getPerimetro(), r1.esCuadrado());
		System.out.println(r1.getVertice1());
	}

}
