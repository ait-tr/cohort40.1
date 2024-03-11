package consultation.cons_15.consultationCode;

public class HandlerExample {
    public static void main(String[] args) {
        Handler handler = new Handler();
        Request request1 = new Request("Test Test Test1", 100);
        Request request2 = new Request("Test2 ", 90);
        Request request3 = new Request("Test3", 120);
        Request request4 = new Request("Test4", 201);
        Request request5 = new Request("Test5", 300);
        Request request6 = new Request("Test6", 404);
        Request request7 = new Request("Test7", 550);

        System.out.println(handler.apply(request1));
        System.out.println(handler.apply(request2));
        System.out.println(handler.apply(request3));
        System.out.println(handler.apply(request4));
        System.out.println(handler.apply(request5));
        System.out.println(handler.apply(request6));
        System.out.println(handler.apply(request7));


    }
}
