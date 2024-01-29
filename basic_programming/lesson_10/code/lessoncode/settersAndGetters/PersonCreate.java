package settersAndGetters;

import scanner.UserInput;

public class PersonCreate {

    public Person createPersonWith3Parameters(){
        UserInput ui = new UserInput();
        String personName = ui.inputText("Please enter person name: ");
        String personAddress = ui.inputText("Please enter person address: ");
        String personCode = ui.inputText("Please enter person code: ");

        return new Person(personName,personAddress,personCode);
    }

    public Person createPersonWith2Parameters(){
        UserInput ui = new UserInput();
        String personName = ui.inputText("Please enter person name: ");
        String personCode = ui.inputText("Please enter person code: ");

        return new Person(personName,personCode);
    }


    public String inputNewAddress(){
        UserInput ui = new UserInput();
        String personAddress = ui.inputText("Please enter person address: ");

        return personAddress;
    }
}
