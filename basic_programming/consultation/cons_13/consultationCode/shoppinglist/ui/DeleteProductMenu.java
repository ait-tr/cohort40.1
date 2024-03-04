package consultation.cons_13.consultationCode.shoppinglist.ui;

import consultation.cons_13.consultationCode.shoppinglist.dto.ResponseForClientForDelete;
import consultation.cons_13.consultationCode.shoppinglist.service.util.UserInput;
import consultation.cons_13.consultationCode.shoppinglist.service.ProductService;

public class DeleteProductMenu implements MenuCommand{

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

        ResponseForClientForDelete deleteResult = service.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
