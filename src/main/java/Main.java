import model.Product;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product apple = new Product("Apple", 0.99);
        Product banana = new Product("Banana", 0.59);

        productService.addProduct(apple);
        productService.addProduct(banana);

        productService.printProducts();

        productService.editProduct(apple, "Green Apple", 1.19);
        productService.printProducts();

        productService.deleteProduct(banana);
        productService.printProducts();
    }
}