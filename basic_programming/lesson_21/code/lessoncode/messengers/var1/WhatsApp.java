package lesson_21.code.lessoncode.messengers.var1;

public class WhatsApp extends Messenger{
    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }

    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в WhatsApp");
    }
}
