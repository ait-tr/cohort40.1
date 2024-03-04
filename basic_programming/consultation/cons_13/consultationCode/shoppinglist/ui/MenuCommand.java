package consultation.cons_13.consultationCode.shoppinglist.ui;

public interface MenuCommand {
    void executeCommand();

    String getMenuName();
    boolean shouldExit();
}
