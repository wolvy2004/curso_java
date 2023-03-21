package clase05;

public class DescuentoTarjeta extends Descuento {

	@Override
	public float descuentoFinal(float valorinicial) {
		float valorFinal = 0;
		valorFinal = (float) (valorinicial * 0.95);
		return valorFinal;
	}

}
