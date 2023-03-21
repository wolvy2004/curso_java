package clase05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CarritoMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String archivo = "/home/edwar1980/eclipse-workspace/clase05/src/clase05/listaproductos.txt";
		Carrito carrito = new Carrito();
		for (String item : Files.readAllLines(Paths.get(archivo))) {
			String [] p = item.split("	");
			Producto producto = new Producto( p[0], Integer.parseInt(p[1]));
			ItemCarrito itemcarrito = new ItemCarrito (producto, Integer.parseInt(p[2]));
			carrito.SetCarrito(itemcarrito);			
		}
	ItemCarrito [] itemscarrito = carrito.getCarrito();	
	System.out.println("Cantidad	precio unit	producto");
		for (ItemCarrito i : itemscarrito ) {
			System.out.println(i.getCantidad() + "		"+i.getItem().getPrecio() + "		" + i.getItem().getNombre());
			
		}
		System.out.println("el importe total del carrito es de; " + carrito.precio());
	}

}
