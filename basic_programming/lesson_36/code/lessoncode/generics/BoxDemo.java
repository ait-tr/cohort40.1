package lesson_36.code.lessoncode.generics;


public class BoxDemo {
    public static void main(String[] args) {
        Box<Paper> boxForPaper = new Box<>();
        Box<Plasic> boxForPlastic = new Box<>();
        Box<Glass> boxForGlass = new Box<>();

        TwoCellBox<Plasic, Glass> plasicGlassTwoCellBox = new TwoCellBox<>();

        TwoCellBox<Paper, Plasic> paperPlasicTwoCellBox = new TwoCellBox<>();

        ThreeCellBox<Paper,Plasic,Glass> paperPlasicGlassThreeCellBox = new ThreeCellBox<>();



    }
}
