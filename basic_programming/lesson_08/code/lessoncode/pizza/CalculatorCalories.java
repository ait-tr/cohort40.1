package lesson_08.code.lessoncode.pizza;




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

        PizzaUtil util = new PizzaUtil();

        Pizza pizza1 = util.createPizza();

        Pizza pizza2 = util.createPizza();

        double extraCalories = pizza2.totalCaloriesInPizza() - pizza1.totalCaloriesInPizza();

        System.out.println("Количество лишних калорий: " + extraCalories);

        System.out.println(pizza1.diameter);
    }


}
