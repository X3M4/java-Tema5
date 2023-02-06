package ejercicio11;

import javax.swing.*;


public class Velero extends Vehiculo {
	public int longitud;
	public final double LIMITE_PRECIO = 100000;
	
	public Velero(int potencia, int ruedas) {
		super(potencia, ruedas);
		setLongitud();
	}
	
	public void setLongitud() {
		int longi = 0;
		String longitud = JOptionPane.showInputDialog(null, "Escribe la longitud del velero");
		try {
			longi = Integer.parseInt(longitud);
			this.longitud = longi;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "El dato introducido no es válido para el campo longitud");
			setLongitud();
		}
	}
	
	public int getLongitud() {
		return this.longitud;
	}

	@Override
	public void setPrecio() {
		try {
			double fprecio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cúal es el precio del velero"));
			if(fprecio <= this.LIMITE_PRECIO) {
				super.precio = fprecio;
			}else {
				JOptionPane.showMessageDialog(null, "El precio del velero no pueder exceder a " + this.LIMITE_PRECIO + "€");
				setPrecio();
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El dato introducido no es una cantidad");
			setPrecio();
		}
		
		
	}
	
	@Override
	public String toString() {
		return String.format("VELERO\nPotencia: %s KW\nLongitud: %d m\nPrecio: %1.2f €", super.getPotencia(), getLongitud(), super.getPrecio());
	}
	public void mostrar() {
		JOptionPane.showMessageDialog(null, toString());
	}
		
	
}
