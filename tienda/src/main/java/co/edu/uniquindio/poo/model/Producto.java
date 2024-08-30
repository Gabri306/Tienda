package co.edu.uniquindio.poo.model;

public class Producto {
    private String nombre;
    private Double precioCompra;
    private String tipo;

    public Producto(String nombre, Double precioCompra, String tipo){
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precioCompra=" + precioCompra + ", tipo=" + tipo + "]";
    }

    public double calcularPrecioVenta() {
        double precioVenta = 0;
        if (tipo.equals("Refrigerados")) {
            precioVenta = precioCompra * 1.10; 
        } else if (tipo.equals("Perecederos")) {
            precioVenta = precioCompra * 1.15;
        } else if (tipo.equals("No perecederos")) {
            precioVenta = precioCompra * 1.05; 
        }
        return precioVenta;
    }
}

