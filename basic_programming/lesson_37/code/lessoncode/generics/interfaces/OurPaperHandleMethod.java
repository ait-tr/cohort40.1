package lesson_37.code.lessoncode.generics.interfaces;

import lesson_36.code.lessoncode.generics.classes.Paper;
import lesson_36.code.lessoncode.generics.interfaces.GarbageHandler;
import lesson_36.code.lessoncode.generics.interfaces.MyPaperHandleMethod;

public class OurPaperHandleMethod implements GarbageHandler<Paper, lesson_36.code.lessoncode.generics.interfaces.MyPaperHandleMethod> {
    @Override
    public void handle(Paper what, MyPaperHandleMethod how) {

    }
}
