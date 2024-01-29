package consultation.cons_02.consultationCode.code.pizzaExampleSimple;

public class CalculatorCalories {
    /*

Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.


diamertPizza1 = 24;

diamertPizza2 = 28;

caloriesInOneCm = 40;

1. считаем площадь в пицце № 1

2. считаем площадь в пицце № 2

3. считаем количество калорий в пицце № 1

4. считаем количество калорий в пицце № 2

5. находим разницу

     */

    public static void main(String[] args) {

        int diameterPizza1 = 24;

        int diameterPizza2 = 28;

        int caloriesInOneCm = 40;

        double caloriesPizza1 = caloriesInOneCm * Math.PI * (diameterPizza1 * diameterPizza1) / 4;

        double caloriesPizza2 = caloriesInOneCm * Math.PI * (diameterPizza2 * diameterPizza2) / 4;

        double extraCalories = caloriesPizza2 - caloriesPizza1;

        System.out.println("Количество лишних калорий: " + extraCalories);
    }


}
