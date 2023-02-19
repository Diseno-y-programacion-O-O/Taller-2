package uniandes.dpoo.taller1.modelo;

public class Menu {

    private String nombre;
    private int precioBase;

	public Menu(String nombreProducto, int valorProducto) {

	    this.nombre = nombreProducto;
	    this.precioBase = valorProducto;
	      
	}

	public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precioBase;
    }
    
    public String generarTextoFactura() {
    	return nombre; //aca algo esta mal
    }
    
}