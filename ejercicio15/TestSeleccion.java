package ejercicio15;

public class TestSeleccion {

	public static void main(String[] args) {
		MiembroSeleccionFutbol[] seleccion = new MiembroSeleccionFutbol[15];
		
		MiembroSeleccionFutbol j1 = new Futbolista ("Villa", 41, 7, "delantero");
		MiembroSeleccionFutbol j2 = new Futbolista ("Iniesta", 38, 8, "Medio");
		MiembroSeleccionFutbol e1 = new Entrenador ("Luis Aragonés", 84, "Española");
		
		seleccion[0] = e1;
		seleccion[1] = j2;
		seleccion[3] = j1;
		
		for(int i = 0; i < seleccion.length; i++) {
			if(seleccion[i] != null)seleccion[i].concentrarse();
			
		}
		
		for(int i = 0; i < seleccion.length; i++) {
			if(seleccion[i] != null)seleccion[i].viajar();
		}
		
		for(int i = 0; i < seleccion.length; i++) {
			if(seleccion[i] != null)seleccion[i].entrenar();
		}
		
		for(int i = 0; i < seleccion.length; i++) {
			if(seleccion[i] != null)seleccion[i].jugarPartido();;
		}
		
		
	}

}
