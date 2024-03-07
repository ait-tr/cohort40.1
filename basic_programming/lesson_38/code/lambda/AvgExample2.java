package lesson_38.code.lambda;

public class AvgExample2 {
    public static void main(String[] args) {

        printMyAverage((a,b,c) -> (a + b + c) / 3.0, 10,12,20);


        printMyAverage((a,b,c) -> {
            double avg = (a + b + c) / 3.0;
            avg = avg * Math.PI;
            avg = Math.sqrt(avg) / c;
            return avg;
        },10,12,20);


        IAverage ref = (a,b,c) -> {
            double avg = (a + b + c) / 3.0;
            double result = avg * avg;
            return result;
        };

        printMyAverage(ref, 10,20,30);

    }


    public static void printMyAverage(IAverage average, double a, double b, double c){
        System.out.println("Our average value: " + average.avg(10,12,20));

    }
}
