package service.interfaces;

import model.Product;

public interface ProductEditor {
    void editProduct(Product product, String name, double price);
}
