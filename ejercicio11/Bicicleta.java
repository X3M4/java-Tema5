package ejercicio11;

import javax.swing.*;

public class Bicicleta extends Vehiculo {
	public String potencia = super.potencia_s;
	public boolean motor_elec = false;
	public final double LIMITE_PRECIO = 3999.99;
	
	public Bicicleta(int potencia, int ruedas) {
		super(String.valueOf(potencia), ruedas);
	}
	
	public Bicicleta() {
		super("1", 2);
	}
	
	public Bicicleta(boolean motor, int potencia) {
		super(String.valueOf(potencia), 2);
		this.motor_elec = true;
	}
	
	public boolean getMotor() {
		return motor_elec;
	}
	@Override
	public void setPotencia(String potencia){
        super.setPotencia(potencia);
    }
	
	@Override
	public String getPotencia(){
		return super.potencia_s;
	}

	@Override
	public void setPrecio() {
				
		try {
			double fprecio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cúal es el precio de la bicicleta"));
			if(fprecio <= this.LIMITE_PRECIO) {
				super.precio = fprecio;
			}else {
				JOptionPane.showMessageDialog(null, "El precio de la bicicleta no pueder exceder a " + this.LIMITE_PRECIO + " €");
				setPrecio();
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El dato introducido no es una cantidad");
			setPrecio();
		}
		
	}
	@Override
	public String toString() {
		return String.format("BICICLETA\nPotencia: %s\nMotor Eléctrico: %b\nRuedas: %d\nPrecio: %1.2f €", getPotencia(), getMotor(), super.getRuedas(), super.getPrecio());
	}
	public void mostrar() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
