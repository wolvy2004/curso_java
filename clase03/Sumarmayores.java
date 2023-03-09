package argentina_programa;



public class Sumarmayores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {5,10,25,80,1,2,8,45,60,150};
		int x = 5;
		int suma = 0;
			for (int i=0; i <numeros.length; i++) {
				if (numeros[i]>x) {
					suma = suma + numeros[i];
				}
			}
		System.out.println ("la suma de los numeros es de: " + suma);
		
	}

}
