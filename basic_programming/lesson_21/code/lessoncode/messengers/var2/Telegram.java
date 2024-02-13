package lesson_21.code.lessoncode.messengers.var2;

public class Telegram  implements MessengerInterface {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в Telegram");
    }
}
