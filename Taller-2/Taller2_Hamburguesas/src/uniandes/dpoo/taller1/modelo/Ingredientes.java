package uniandes.dpoo.taller1.modelo;

public class Ingredientes {
    
    private String nombre;
    private int costoAdicional;

    public Ingredientes(String nombre, int costoAdicional) {
        this.nombre = nombre;
        this.costoAdicional = costoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCostoAdicional() {
        return costoAdicional;
    }
    
}