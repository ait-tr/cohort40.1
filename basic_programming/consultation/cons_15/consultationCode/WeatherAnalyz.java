package consultation.cons_15.consultationCode;

import java.util.function.Function;
import java.util.function.Predicate;

public class WeatherAnalyz {
    public static void main(String[] args) {
        WeatherData data = new WeatherData(25, "солнечно");

        Predicate<WeatherData> isTemperatureValid = wd -> wd.getTemp() >= -50 && wd.getTemp() <= 50;

        Function<WeatherData, String> getDescriptionMessage = wd -> {

            switch (wd.getDescription().toLowerCase()) {
                case "солнечно": return "Не забудьте солнцезащитный крем!";
                case "облачно": return "Может быть, понадобится зонт.";
                case "дождь": return "Не забудьте зонт!";
                default: return "Сегодняшняя погода: " + wd.getDescription();
            }
        };

        if (!isTemperatureValid.test(data)) {
            System.out.println("Некорректные данные о температуре.");
        } else {
            System.out.println(getDescriptionMessage.apply(data));
        }
    }
}
