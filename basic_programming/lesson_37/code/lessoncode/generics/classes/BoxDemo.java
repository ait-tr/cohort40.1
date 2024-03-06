package lesson_37.code.lessoncode.generics.classes;


import lesson_36.code.lessoncode.generics.classes.Box;
import lesson_36.code.lessoncode.generics.classes.Glass;
import lesson_36.code.lessoncode.generics.classes.Paper;
import lesson_36.code.lessoncode.generics.classes.Plasic;
import lesson_36.code.lessoncode.generics.classes.TwoCellBox;

public class BoxDemo {
    public static void main(String[] args) {
        lesson_36.code.lessoncode.generics.classes.Box<lesson_36.code.lessoncode.generics.classes.Paper> boxForPaper = new lesson_36.code.lessoncode.generics.classes.Box<>();
        lesson_36.code.lessoncode.generics.classes.Box<lesson_36.code.lessoncode.generics.classes.Plasic> boxForPlastic = new lesson_36.code.lessoncode.generics.classes.Box<>();
        lesson_36.code.lessoncode.generics.classes.Box<lesson_36.code.lessoncode.generics.classes.Glass> boxForGlass = new Box<>();

        TwoCellBox<lesson_36.code.lessoncode.generics.classes.Plasic, lesson_36.code.lessoncode.generics.classes.Glass> plasicGlassTwoCellBox = new TwoCellBox<>();

        TwoCellBox<lesson_36.code.lessoncode.generics.classes.Paper, lesson_36.code.lessoncode.generics.classes.Plasic> paperPlasicTwoCellBox = new TwoCellBox<>();

        ThreeCellBox<Paper, Plasic, Glass> paperPlasicGlassThreeCellBox = new ThreeCellBox<>();



    }
}
