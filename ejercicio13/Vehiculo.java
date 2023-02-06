package ejercicio13;

public abstract class Vehiculo {
    public int ruedas;
    public double precio;
    public String potencia_s;

    public Vehiculo(int potencia, int ruedas) {
        String potencias = String.valueOf(potencia);
        setPotencia(potencias);
        setRuedas(ruedas);
        setPrecio();
    }
    
    public Vehiculo(String potencia, int ruedas) {
    	int potenciai = Integer.parseInt(potencia);
    	if(potenciai == 1) {
    		setPotencia(potencia + " persona");
    	}else if(potenciai >1 && potenciai < 2) {
    		setPotencia(potencia + " personas");
    	}else {
    		setPotencia(potencia  + " W");
    	}
    	setRuedas(ruedas);
    	setPrecio();
    }
    
    public void setPotencia(String potencia) {
		this.potencia_s = potencia;
		
	}

    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }

    public void preguntaPrecio(){
        System.out.println("¿Cual es el precio del vehículo?");
    }

    public String getPotencia(){
    	String potencias = String.valueOf(this.potencia_s);
        return potencias;
    }

    public int getRuedas(){
        return ruedas;
    }

    public double getPrecio(){
        return precio;
    }

    abstract void setPrecio();

	

}
