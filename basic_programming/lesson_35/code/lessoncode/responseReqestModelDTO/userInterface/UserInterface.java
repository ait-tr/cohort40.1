package lesson_35.code.lessoncode.responseReqestModelDTO.userInterface;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_35.code.lessoncode.responseReqestModelDTO.dto.ProductDto;
import lesson_35.code.lessoncode.responseReqestModelDTO.dto.ResponseForClientAddProduct;
import lesson_35.code.lessoncode.responseReqestModelDTO.service.ProductService;

public class UserInterface {

    ProductService service = new ProductService();
    UserInput userInput = new UserInput();

    public void start(){

        while (true) {
            System.out.println();
            printMenu();
            int userChoice = enterUserChoice();

            switch (userChoice) {
                case 1:
//                    int id = userInput.inputInteger("Введите id продукта:");
                    String productName = userInput.inputText("Введите название продукта:");
                    double price = userInput.inputDouble("Введите цену продукта:");
                    String productDescription = userInput.inputText("Введите описание продукта:");

                    ProductDto productDto = new ProductDto(productName,price,productDescription);

                    ResponseForClientAddProduct addResult = service.addNewProduct(productDto);

                    System.out.println(addResult);
                    break;
                case 2:
                    service.findAll();
                    break;
                case 3:
                    System.out.println("такой опции еще нет");
                    break;
                case 4:
                    System.out.println("Работа приложения завершена");
                    System.exit(0);
            }
        }

    }

    private int enterUserChoice() {
        return userInput.inputInteger("Выберете пункт меню:");
    }


    private void printMenu(){
        System.out.println("1. Ввод нового продукта");
        System.out.println("2. Вывод всех продуктов");
        System.out.println("3. Поиск продукта по id");
        System.out.println("4. Exit");



    }
}
