package ejercicio8;

public class prueba_ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto2D.Float p1 = new Punto2D.Float(3,0);
		Punto2D.Float p2 = new Punto2D.Float(0,3);

		Punto2D.Double p3 = new Punto2D.Double(0, 0);
		Punto2D.Double p4 = new Punto2D.Double(3, 0);

		Punto2D.Float p5 = p1.suma(p2);

		Punto2D.Double p7 = p3.suma(p4);

		System.out.println(p5);
		System.out.println(p7);
		
	}

}
