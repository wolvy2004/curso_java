package argentina_programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ordenarnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char orden;
		Integer ordenados[]= new Integer[3];
		Scanner capturar = new Scanner(System.in);
		System.out.print("ingrese su primer numero");
		ordenados[0] = capturar.nextInt();
		System.out.print("ingrese su segundo numero");
		ordenados[1] = capturar.nextInt();
		System.out.print("ingrese su tercer numero");
		ordenados[2] = capturar.nextInt();
		System.out.print("indique el orden Ascendente (a) Desendente (d)");
		orden = capturar.next().charAt(0);
		
		
		if(orden==('a')) {
			Arrays.sort(ordenados);
			for(int n:ordenados) {
				System.out.println(n);
			}
			
		} else if (orden==('d')) {
			
			Arrays.sort(ordenados, Collections.reverseOrder());
			for(int n:ordenados) {
				System.out.println(n);
			}
			
		} else {
			System.out.println("no es una opcion valida");
		}
		

	}

}
