package lesson_19.code.lessoncode.incapsulation;

public class Phone {

    private String producer;
    private String model;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public void makeCall(String telNumber){
        call();
    }

    public void receiveCall(){
        System.out.println("ВАМ ЗВОНИТ ");
        call();
    }


    private void call(){
        // техническое обеспечение разговора
        /*
        отправить запрос на вышку
        произвести коммутация
        проверить есть ли запрос от вышки на соединение (то есть идет внешний звонок)
        отправить запрос на соединение
        и т д
         */
    }


}
