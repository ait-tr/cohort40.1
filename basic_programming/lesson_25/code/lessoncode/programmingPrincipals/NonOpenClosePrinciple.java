package lesson_25.code.lessoncode.programmingPrincipals;

public class NonOpenClosePrinciple {

    int compareCriteria;

    public NonOpenClosePrinciple(int compareCriteria) {
        this.compareCriteria = compareCriteria;
    }

    public boolean badPractice(int x, int y, int compareCriteria){
        return goodPractice(x,y,compareCriteria);
    }

    public boolean badPractice(int x, int y){
       return goodPractice(x,y,compareCriteria);
    }

    private boolean goodPractice(int x, int y, int compareCriteria) {
        boolean result = true;

        if ((x + y) < compareCriteria) {
            result = false;
        }

        return result;
    }
    // необходимо писать код так чтобы 1000 - не использовать внутри кода
    // а ПЕРЕДОВАТЬ в качестве аргумента метода
}
