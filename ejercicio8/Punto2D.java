package ejercicio8;

public abstract class Punto2D {
	protected float[] puntof = new float[2];
	protected double[] puntod = new double[2];
	
	public Punto2D(float x, float y){
		this.puntof[0] = x;
		this.puntof[1] = y;
	}

	public Punto2D(double x, double y){
		this.puntod[0] = x;
		this.puntod[1] = y;
    }
//CLASE ESTÁTICA FLOAT
	static class Float extends Punto2D{
		public Float(float x, float y) {
			super(x, y);
        }
		
		public float getX() {
			return this.puntof[0];
		}
		public float getY() {
			return this.puntof[1];
		}
		void setX(float x) {
			this.puntof[0] = x;
        }
		void setY(float y) {
			this.puntof[1] = y;
		}
		public Float suma(Punto2D.Float p){
			float x = this.getX() + p.getX();
			float y = this.getY() + p.getY();
			Punto2D.Float  p3 = new Float(x, y);
			return p3;
		}
		@Override
		public String toString() {
			return String.format("%1.2f - %1.2f", this.puntof[0], this.puntof[1]);
		}
	}
//CLASE ESTÁTICA DOUBLE
    static class Double extends Punto2D{
		public Double(double x, double y) {
			super(x, y);
        }

        public double getX() {
            return this.puntod[0];
		}
		public double getY() {
            return this.puntod[1];
		}
        void setX(double x) {
			this.puntod[0] = x;
        }
		void setY(double y) {
		}
		public Double suma(Punto2D.Double p){
			double x = this.getX() + p.getX();
            double y = this.getY() + p.getY();
            Punto2D.Double  p3 = new Double(x, y);
            return p3;
        }
		@Override
        public String toString() {
			return String.format("%1.2f - %1.2f", this.puntod[0], this.puntod[1]);
		}	
	}

}


