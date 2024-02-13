package lesson_21.code.lessoncode.messengers.var2;

public class WhatsApp implements MessengerInterface {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в WhatsApp");
    }
}
