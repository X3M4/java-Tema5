package ejercicio14;

import java.util.Scanner;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strV = new String[5];
		int veleros = 0;
		int bicis = 0;
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String eleccion;
		
		for(int i = 0; i < strV.length; i++) {
			Vehiculo v = null;
			 System.out.println("¿Bici o Velero?");
			 eleccion = sc.nextLine();
			 strV[i] = eleccion;
			 
			 if(eleccion.equals("bici")) {
				 v = new Bicicleta();
				 sb.append(i);
				 sb.append(v.getClass());
				 sb.append(v);
				 sb.append("\n");
				 
			 }else if(eleccion.equals("velero")) {
				 v = new Velero(45,0);
				 sb.append(i);
				 sb.append(v.getClass());
				 sb.append(v);
				 sb.append("\n");
			 }
			 if(v instanceof Velero) {
				 veleros++;
			 }else if(v instanceof Bicicleta) {
				 bicis++;
			 }
		}
		
		System.out.printf("Veleros: %d\nBicicletas: %d", veleros, bicis);
		System.out.println(sb);

	}

	
}
