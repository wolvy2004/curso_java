package clase05;

public class ItemCarrito {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Producto item;
	private int cantidad;
	
	public ItemCarrito(Producto i, int c) {
		this.item = i;
		this.cantidad = c;
	}

	public Producto getItem() {
		return item;
	}

	public void setItem(Producto item) {
		this.item = item;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
