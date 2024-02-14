package lesson_22.code.lessoncode.task1Var2;

public class TeaCollection {

    Tea[] teas;


    public TeaCollection(int sizeOfTeaCollection) {
        this.teas = new Tea[sizeOfTeaCollection];
    }

    public Tea[] getTeas() {
        return teas;
    }

    public int add(Tea newTea){
        boolean isNull = false;

        int i = 0;
        int nullIndex = -1;

        while (!isNull && i < teas.length) {
            if (teas[i] == null) {
                nullIndex = i;
                isNull = true;
            }
                i++;
        }

        if (nullIndex > -1) {
            teas[nullIndex] = newTea;
        } else {
            System.out.println("Нет свободного места!");
        }

        return nullIndex;
    };

    public Tea findById(int searchTeaId){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaId() == searchTeaId) {
                return teas[i];
            }
        }
        return null;
    };

    public Tea findByName(String searchTeaName){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaName().equals(searchTeaName)) {
                return teas[i];
            }
        }
        return null;
    };

    public boolean delete(Tea teaForDelete){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].equals(teaForDelete)) {
                teas[i] = null;
                return true;
            }
        }

        return false;
    };

    public boolean delete(int teaIdForDelete){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaId() == teaIdForDelete) {
                teas[i] = null;
                return true;
            }
        }

        return false;
    };

    public boolean delete(String teaNameForDelete){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaName().equals(teaNameForDelete)) {
                teas[i] = null;
                return true;
            }
        }

        return false;
    };


    public void printCollection(){
        System.out.println("=========== Наша чайная коллекция ============");
        for (int i = 0; i < teas.length; i++) {
            if (teas[i] != null) {
                System.out.println("№ " + teas[i].getTeaId());
                System.out.println("Производитель " + teas[i].getTeaProducer().getProducerName());
                System.out.println("Название " + teas[i].getTeaName());
                System.out.println("Тип чая: " + teas[i].getTeaType());
            } else {
                System.out.println("Пустая ячейка массива");
            }
            System.out.println("-------------");
        }
    }

}
