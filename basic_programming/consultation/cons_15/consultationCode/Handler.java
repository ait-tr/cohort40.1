package consultation.cons_15.consultationCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Handler implements Function<Request, String> {

    private final Map<Predicate<Integer>, String> responses;

    public Handler() {
        this.responses = new LinkedHashMap<>();
        responses.put(v -> v >=100 && v < 200, "Запрос получен");
        responses.put(v -> v >=200 && v < 300, "Ok");
        responses.put(v -> v >=300 && v < 400, "Сервисный запрос");
        responses.put(v -> v >=400 && v < 500, "Ошибка пользователя");
        responses.put(v -> v >=500 && v <= 550, "Ошибка сервера");
    }


    @Override
    public String apply(Request request) {
        /*
- проверка на длину из request (используя Predicate)

- проверка значения и получение сообщения
для получения сообщения мы должны:
используем Predicate для проверки значения и в зависимости от
результата проверки нам возвращается ответ (String)
         */

        if (request.getMessage().length() > 10) {
            return "Некорректные входящие данные: длина сообщения превышает 10 символов";
        }

        for (Map.Entry<Predicate<Integer>, String> entry : responses.entrySet()){
            if (entry.getKey().test(request.getNumber())) {
                return entry.getValue();
            }
        }

        return "Значение в запросе не входит в установленный диапазон" ;
    }
}
