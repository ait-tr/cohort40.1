package consultation.cons_13.consultationCode.shoppinglist;

import consultation.cons_13.consultationCode.shoppinglist.repository.ProductRepository;
import consultation.cons_13.consultationCode.shoppinglist.repository.ProductRepositoryArrayList;
import consultation.cons_13.consultationCode.shoppinglist.service.ProductService;
import consultation.cons_13.consultationCode.shoppinglist.service.Validation;
import consultation.cons_13.consultationCode.shoppinglist.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
// создаем основные классы для работы сервиса

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);


        // создаем классы для формирования пунктов меню

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductMenu findAllProductMenu = new FindAllProductMenu(service);
        FindByIdProductMenu findByIdProductMenu = new FindByIdProductMenu(service);
        DeleteProductMenu deleteProductMenu = new DeleteProductMenu(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> menuCommands = new ArrayList<>();

        menuCommands.add(addProductMenu);
        menuCommands.add(findAllProductMenu);
        menuCommands.add(findByIdProductMenu);
        menuCommands.add(deleteProductMenu);
        menuCommands.add(exitMenu);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
