package clase05;

public class DescuentoContado extends Descuento {

	
	@Override
	public float descuentoFinal(float valorinicial) {
		float valorFinal = 0;
		valorFinal = (float) (valorinicial * 0.9);
		return valorFinal;
	}

}
