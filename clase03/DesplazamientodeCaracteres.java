package argentina_programa;

import java.util.Scanner;

public class DesplazamientodeCaracteres {
	
	public static void main(String[] args) {
	 // para este ejercicio emplee el codepointat que me permite agregar numeracion y simbolos
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresar texto a codificar");
		String texto = sc.nextLine();
		System.out.println("ingresar cantidad de desplazamientos");
		int desplazamiento = sc.nextInt();
		String codificado ="";
		int temp;
		for (int i=0; i<texto.length(); i++) {
			temp = texto.codePointAt(i) + desplazamiento;
			codificado = codificado + (char)temp;
		}
		System.out.println("el texto codificado es:");
		System.out.println(codificado);
		
			
	}


}
