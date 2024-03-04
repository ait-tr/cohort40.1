package consultation.cons_13.consultationCode.shoppinglist.repository;


import consultation.cons_13.consultationCode.shoppinglist.dto.ProductDto;
import consultation.cons_13.consultationCode.shoppinglist.entity.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRepositoryArrayList implements ProductRepository{

    private List<Product> database;

    private Integer idCounter;

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();
        this.idCounter = 0;
    }

    @Override
    public Integer addProduct(ProductDto productDto) {
        idCounter++;
        database.add(new Product(idCounter, productDto.getProductName(), productDto.getPrice(), productDto.getDescription()));
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return database;
    }

    @Override
    public Product findById(Integer id) {

        for (Product currentProduct : database) {
            if (currentProduct.getId().equals(id)) {
                return currentProduct;
            }
        }

        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        Iterator<Product> iterator = database.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
