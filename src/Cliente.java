import Abstracto.Producto;
import Interfaces.Vendible;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
    }

    public void comprarProducto(Producto producto, int cantidad) {
        productosComprados.add(producto); // Agregar el producto a la lista de compras sin validar stock
        System.out.println(nombre + " compró " + cantidad + " unidades  " );
    }

    public void mostrarCompra() {
        System.out.println("Compra de " + nombre + ":");
        double costoTotal = 0.0;

        for (Producto producto : productosComprados) {
            int cantidadComprada = 1; // Suponiendo que se compró una unidad por simplicidad
            double precioVenta = ((Vendible) producto).calcularPrecioVenta(cantidadComprada);
            costoTotal += precioVenta;

            producto.calcularDetalles();
            System.out.println("Costo Total: $" + precioVenta);
        }

        System.out.println("Costo Total de la compra: $" + costoTotal);
    }}