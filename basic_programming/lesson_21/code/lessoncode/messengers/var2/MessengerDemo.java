package lesson_21.code.lessoncode.messengers.var2;

public class MessengerDemo {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();
        Viber viber = new Viber();

        MessengerInterface[] messengerInterfaces = {telegram, whatsApp,viber};

        for (int i = 0; i < messengerInterfaces.length; i++) {
            messengerInterfaces[i].sendMessage();
        }
    }
}
