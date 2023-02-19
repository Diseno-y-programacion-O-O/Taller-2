package uniandes.dpoo.taller1.modelo;

public class Combos{


    private double descuento;
    private String nombreCombo;
    private int precioBase;

    public Combos(String nombreCombo, double descuento) {
        this.descuento = descuento;
        this.nombreCombo = nombreCombo;
    }

    public String getNombre() {
    	return nombreCombo;

    }

    public int getPrecio(int precio) {
    	this.precioBase = precio; //descuento
    	return precioBase;
    
    }

    public String generarTextoFactura(){
    	String text = ""; 
    	return text;
	    
	}
    
}
