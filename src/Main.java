import product.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.registerProduct("Mouse", "Mouse sem fio, 36000DPI, recarregavel", 180);
        p1.available("nao");
        p1.product();

        System.out.println();

        Product p2 = new Product();
        p2.registerProduct("Teclado", "Teclado mecanico silencioso", 240);
        p2.available("sim");
        p2.product();
        p2.listing("sim");


    }
}