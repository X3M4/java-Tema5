package ejercicio13;

import javax.swing.JOptionPane;

public class CocheAsegurado extends Vehiculo implements Asegurable {
	public double cobertura;
	public final double PRECIO_MAXIMO = 60000;
	
	public CocheAsegurado(int potencia, int ruedas) {
		super(potencia, ruedas);
		setCobertura();
	}

	@Override
	public void setCobertura() {
		// TODO Auto-generated method stub
		this.cobertura = getPrecio() * 0.9;
	}

	@Override
	public double getCobertura() {
		// TODO Auto-generated method stub
		return this.cobertura;
	}

	@Override
	void setPrecio() {
		// TODO Auto-generated method stub
		String valor = JOptionPane.showInputDialog(null, "¿Cúal es el precio del coche");
		double fprecio = 0;
		
		try {
			fprecio = Double.parseDouble(valor);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El dato introducido no es una cantidad");
			setPrecio();
		}
		
		if(fprecio <= this.PRECIO_MAXIMO) {
			super.precio = fprecio;
		}else {
			JOptionPane.showMessageDialog(null, "El precio del coche no pueder exceder a " + this.PRECIO_MAXIMO + "€");
			setPrecio();
		}
	}
	@Override
	public String toString() {
		return String.format("COCHE ASEGURADO\nPrecio: %1.2f €\nPotencia: %s KW\nRuedas: %d\nCobertura %1.2f €", 
				getPrecio(), getPotencia(), getRuedas(), getCobertura());
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
}
