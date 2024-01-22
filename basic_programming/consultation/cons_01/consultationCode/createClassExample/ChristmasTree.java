package createClassExample;

public class ChristmasTree {

    String christmasTreeToys;

    public ChristmasTree(String christmasTreeToys) {
        this.christmasTreeToys = christmasTreeToys;
    }

    public void garland(){
        System.out.println("Гирлянда горит!");
        System.out.println("Игрушки на елке:" + christmasTreeToys);
    }

}
