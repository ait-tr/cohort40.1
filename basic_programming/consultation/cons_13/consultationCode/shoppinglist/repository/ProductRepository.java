package consultation.cons_13.consultationCode.shoppinglist.repository;

import consultation.cons_13.consultationCode.shoppinglist.dto.ProductDto;
import consultation.cons_13.consultationCode.shoppinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);
}
