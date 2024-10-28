import Abstracto.Producto;

public class Main {
    public static void main(String[] args) {

        Producto laptop1 = new Laptod( "Intel i7", "16 gb");
        Producto celular1 = new Celular("4000 mph", "108MP");


        laptop1.calcularDetalles();
        celular1.calcularDetalles();


        Cliente cliente1 = new Cliente("Juan Galindo", "juan@hotmail.com");


        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 6);


        cliente1.mostrarCompra();






    }
}