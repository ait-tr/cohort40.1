package lesson_35.code.lessoncode.responseReqestModel.service;

import lesson_35.code.lessoncode.responseReqestModel.entity.Product;
import lesson_35.code.lessoncode.responseReqestModel.repository.ProductRepositoryArrayList;

import java.util.List;


public class ProductService {

    ProductRepositoryArrayList repository = new ProductRepositoryArrayList();

    public boolean addNewProduct(Integer id, String productName, Double price, String description) {
        /*

        - проверить правильность этих данных
        - создать новый экземпляр класса Product
        - передать это новый продукт в репозиторий на запись
         */

        if (!validation(id, productName, price, description)) {
            return false;
        }

        Product newProduct = new Product(id,productName,price,description);

        return repository.addProduct(newProduct);

    }

    public void findAll(){
        List<Product> products = repository.findAll();

        System.out.println(products);
//        for (Product product : products){
//            System.out.println(product);
//        }
    }



    private boolean validation(Integer id, String productName, Double price, String description) {
        if (id < 0 || productName.isBlank() || price < 0 || description.isBlank()) {
            return false;
        }

        return true;
    }
}
