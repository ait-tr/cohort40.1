package consultation.cons_14.consultationCode.generics3;

import java.util.List;

public class Container <T>{

    private T data;

    public Container(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void printData(String typeOfData){
        if (typeOfData.equals("List")) {
            List dataAsList = (List) data;
            for (int i = 0; i < dataAsList.size(); i++) {
                System.out.println(dataAsList.get(i));
            }
        }
    }
}
