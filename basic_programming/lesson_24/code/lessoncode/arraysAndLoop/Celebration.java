package lesson_24.code.lessoncode.arraysAndLoop;

public class Celebration {
    public static void main(String[] args) {
        Ball ballRedHeart = new Ball("Heart","Red","I love you");
        Ball ballDarkBlueClassic = new Ball("Classic", "Dark Blue", "Clouds");
        Ball ballSilverStar = new Ball("Star", "Silver"," Happy Birthday");
        Ball ballRedClassic = new Ball("Classic", "Red", "Clouds");
        Ball ballLLightBlueClassic = new Ball("Classic", "Light Blue", "Clouds");

        String[] colors = { "Light Blue", "Dark Blue", "Red", "Silver"};


        Ball[] balls = {ballRedHeart,ballRedHeart,ballRedHeart,
                ballDarkBlueClassic,ballDarkBlueClassic ,
                ballDarkBlueClassic ,ballDarkBlueClassic ,
                ballDarkBlueClassic ,ballSilverStar ,
                ballSilverStar , ballRedClassic ,
                ballRedClassic ,ballRedClassic ,
                ballLLightBlueClassic ,ballLLightBlueClassic ,
                ballLLightBlueClassic ,ballLLightBlueClassic ,
                ballLLightBlueClassic ,ballLLightBlueClassic };

        for (int i = 0; i < balls.length; i++) {
            System.out.println("Цвет шарика : " + balls[i].getColor() + " форма: " + balls[i].getForm());
        }


        for (int i = balls.length - 1 ; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i - 1));
            Ball temp = balls[randomIndex];
            balls[randomIndex] = balls[i];
            balls[i] = temp;
        }

        System.out.println("======= перемешали все шарики =======");
        for (int i = 0; i < balls.length; i++) {
            System.out.println("Цвет шарика : " + balls[i].getColor() + " форма: " + balls[i].getForm());
        }


        boolean notSorted = true;
        Ball temp;

        while (notSorted) {
            notSorted = false;

            for (int i = 0; i < balls.length - 1; i++) {

                int colorNumberBallCurrent = -1;
                int colorNumberBallNext = -1;

                for (int j = 0; j < colors.length; j++) {
                    if (colors[j].equals(balls[i].getColor())) {
                        colorNumberBallCurrent = j;
                    }
                }

                for (int j = 0; j < colors.length; j++) {
                    if (colors[j] == balls[i + 1].getColor()) {
                        colorNumberBallNext = j;
                    }
                }

                if (colorNumberBallCurrent > colorNumberBallNext) {
                     temp = balls[i];
                     balls[i] = balls[i + 1];
                     balls[i + 1] = temp;
                     notSorted = true;
                }
            }
        }

        System.out.println("======= отсортировали все шарики =======");
        for (int i = 0; i < balls.length; i++) {
            System.out.println("Цвет шарика : " + balls[i].getColor() + " форма: " + balls[i].getForm());
        }


    }
}
