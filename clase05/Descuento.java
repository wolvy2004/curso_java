package clase05;

public abstract class Descuento {
	
	private float descuento;

	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public abstract float descuentoFinal(float valorinicial); 

}
