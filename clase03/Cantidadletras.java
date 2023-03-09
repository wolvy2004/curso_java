package argentina_programa;

import java.util.Scanner;

public class Cantidadletras {
	
	public static void main(String[] args) {
		String frase;
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor ingresar frase");
		frase = sc.nextLine();
		System.out.println("por favor ingresar letra a contar");
		letra = sc.next().charAt(0);
		int cant = 0;
		for(int i=0; i<frase.length();i++) {
			if (frase.charAt(i)==letra) {
				cant = cant +1;
			}
		}
		System.out.println("la cantidad de caracteres de la frase es " + frase.length());
		System.out.print("la cantidad de veces que se repite la letra " + letra + " es: " + cant + " veces");

}
	}
