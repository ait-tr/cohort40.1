package consultation.cons_13.consultationCode.shoppinglist.ui;

import java.util.List;
import java.util.Scanner;

public class UserMenu {
    private final List<MenuCommand> commands;

    public UserMenu(List<MenuCommand> commands) {
        this.commands = commands;
    }

    public void startUserMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exitRequested = false;

        while (!exitRequested) {
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ". " + commands.get(i).getMenuName());
            }
            System.out.println("Make your choice: ");

            int userInput = Integer.parseInt(scanner.next());

            if (userInput < 0 || userInput >= commands.size()) {
                System.out.println("Invalid option, please try again.");
            }
            else {
                MenuCommand command = commands.get(userInput);
                command.executeCommand();
                exitRequested = command.shouldExit();
            }


        }
    }
}
