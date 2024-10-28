package Abstracto;

public  abstract class Producto {
    String marca;
    public int precio;
    int cantidadStok;
    public abstract void calcularDetalles();

    public Producto() {
    }

    public Producto(String marca, int precio, int cantidadStok) {
        this.marca = marca;
        this.precio = precio;
        this.cantidadStok = cantidadStok;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadStok() {
        return cantidadStok;
    }

    public void setCantidadStok(int cantidadStok) {
        this.cantidadStok = cantidadStok;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStok=" + cantidadStok +
                '}';
    }
}
