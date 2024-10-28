import Abstracto.Producto;
import Interfaces.Vendible;

public class Celular extends Producto implements Vendible {
    String capasidadDeBateria;
    String camaraResolucion;

    @Override
    public void calcularDetalles() {
        System.out.println("el computador tiene una capacidad de bateria de"+capasidadDeBateria+"y una resolucion de camara de "+camaraResolucion);
    }

    public Celular() {
    }

    public Celular(String capasidadDeBateria, String camaraResolucion) {
        this.capasidadDeBateria = capasidadDeBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public String getCapasidadDeBateria() {
        return capasidadDeBateria;
    }

    public void setCapasidadDeBateria(String capasidadDeBateria) {
        this.capasidadDeBateria = capasidadDeBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capasidadDeBateria=" + capasidadDeBateria +
                ", camaraResolucion=" + camaraResolucion +
                '}';
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9; // 10% de descuento
        }
        return total;
    }
    }

