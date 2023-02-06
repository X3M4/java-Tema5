package ejercicio11;

public class pruebaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velero v = new Velero(25,0);
		System.out.println(v);
		
		Bicicleta b = new Bicicleta(1, 2);
		Bicicleta b2 = new Bicicleta();
		Bicicleta b3 = new Bicicleta(true, 25);
		
		v.mostrar();
		b.mostrar();
		b2.mostrar();
		b3.mostrar();
	}

}
