import Abstracto.Producto;
import Interfaces.Vendible;

public class Laptod extends Producto implements Vendible {
    String procesador;
    String memoriaRam;


    @Override
    public void calcularDetalles() {
        System.out.println("el computador tiene un procesador"+procesador+"y tambien tiene una memoria ram de "+memoriaRam);
    }

    public Laptod() {
    }

    public Laptod(String procesador, String memoriaRam) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Laptod{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
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
