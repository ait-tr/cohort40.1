package consultation.cons_13.consultationCode.shoppinglist.ui;

import consultation.cons_13.consultationCode.shoppinglist.dto.ProductDto;
import consultation.cons_13.consultationCode.shoppinglist.dto.ResponseForClientAddProduct;
import consultation.cons_13.consultationCode.shoppinglist.dto.ResponseForClientFindByIdProduct;
import consultation.cons_13.consultationCode.shoppinglist.service.util.UserInput;
import consultation.cons_13.consultationCode.shoppinglist.service.ProductService;

public class FindByIdProductMenu implements MenuCommand{

    private final ProductService service;

    public FindByIdProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idForSearch = UserInput.getInt("Please enter product id for search:");

        ResponseForClientFindByIdProduct findByIdResult = service.findById(idForSearch);
        System.out.println(findByIdResult);

    }

    @Override
    public String getMenuName() {
        return "Find product by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
