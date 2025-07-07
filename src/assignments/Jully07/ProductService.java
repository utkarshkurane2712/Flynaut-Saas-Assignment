package assignments.Jully07;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    boolean updateProduct(int id, String newName, double newPrice);
    boolean removeProduct(int id);
    Product getProductById(int id);
    List<Product> getAllProducts();
}
