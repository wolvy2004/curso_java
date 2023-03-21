package clase05;
import java.util.Date;

public class Carrito {
	private ItemCarrito [] carrito = new ItemCarrito[5];
	private int id;
	private Date fecha;
	
	public Carrito() {
		this.id = (int) Math.random()*7841;
		this.fecha = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}

	public void SetCarrito(ItemCarrito item) {
		System.out.println("nuevo ingreso "+item.getItem().getNombre());
			for(int i= 0; i< carrito.length; i++) {
				if (carrito[i]==null) {
					carrito[i]=item;
					return;
				
				 } 
			}
			
	}
	public ItemCarrito [] getCarrito() {
		return carrito;
	}
		
	
	public float precio() {
		float precio =0;
		for (ItemCarrito c: carrito) {
			precio = precio + (c.getItem().getPrecio() * c.getCantidad());
		}
		return precio;
	}
	

}
