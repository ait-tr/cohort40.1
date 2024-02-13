package lesson_21.code.lessoncode.interfaces;

public class Pedestrian extends Person implements Moving{

     @Override
     public void movement() {
          System.out.println("Пешеход движется по своему");

     }
}
