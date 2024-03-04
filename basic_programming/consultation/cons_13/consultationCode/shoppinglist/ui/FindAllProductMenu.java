package consultation.cons_13.consultationCode.shoppinglist.ui;

import consultation.cons_13.consultationCode.shoppinglist.dto.ProductDto;
import consultation.cons_13.consultationCode.shoppinglist.dto.ResponseForClientAddProduct;
import consultation.cons_13.consultationCode.shoppinglist.dto.ResponseForClientFindAllProducts;
import consultation.cons_13.consultationCode.shoppinglist.service.util.UserInput;
import consultation.cons_13.consultationCode.shoppinglist.service.ProductService;

public class FindAllProductMenu implements MenuCommand{

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
