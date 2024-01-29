package lesson_08.code.lessoncode.pizza;

public class Pizza {

    int diameter;
    int caloriesInOneCm;

    public Pizza(int diameter, int caloriesInOneCm) {
        this.diameter = diameter;
        this.caloriesInOneCm = caloriesInOneCm;
    }

    public double totalCaloriesInPizza(){
        double caloriesPizza = caloriesInOneCm * Math.PI * (diameter * diameter) / 4;
        return caloriesPizza;
    }

}
