package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Tienda {
    private String nombre;
    private Producto[]listaProductos;

    public Tienda(String nombre, int numeroProductos){
        this.nombre = nombre;
        this.listaProductos = new Producto[numeroProductos];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", listaProductos=" + Arrays.toString(listaProductos) + "]";
    }
    
    

}
