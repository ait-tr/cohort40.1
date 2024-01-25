package pizza;

import scanner.UserInput;

public class PizzaUtil {

    public Pizza createPizza(){
        UserInput ui = new UserInput();

        int diameterPizza = ui.inputInteger("Please enter first pizza diameter: ");

        int caloriesInOneCm = ui.inputInteger("Please enter 1 cm pizza calories: ");

        Pizza myNewPizza = new Pizza(diameterPizza, caloriesInOneCm);

        return myNewPizza;

    }
}
