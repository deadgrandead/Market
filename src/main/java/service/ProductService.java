package service;

import model.Product;
import service.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductAdder, ProductEditor, ProductFinder, ProductPrinter, ProductRemover {
    private final List<Product> products = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(Product product, String name, double price) {
        product.setName(name);
        product.setPrice(price);
    }

    @Override
    public Product findProduct(String name) {
        for(Product product : products) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void printProducts() {
        for(Product product : products) {
            System.out.println("Name: " + product.getName() + " Price: " + product.getPrice());
        }
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
