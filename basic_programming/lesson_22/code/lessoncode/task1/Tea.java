package lesson_22.code.lessoncode.task1;

public class Tea {
    private int teaId;
    private TeaProducer teaProducer;
    private String teaName;
    private TeaTypes teaTypes;
    private int indexArrayTeaType;

    public Tea(int teaId, TeaProducer teaProducer, String teaName, TeaTypes teaTypes, int indexArrayTeaType) {
        this.teaId = teaId;
        this.teaProducer = teaProducer;
        this.teaName = teaName;
        this.teaTypes = teaTypes;
        this.indexArrayTeaType = indexArrayTeaType;
    }

    public int getTeaId() {
        return teaId;
    }

    public TeaProducer getTeaProducer() {
        return teaProducer;
    }

    public String getTeaName() {
        return teaName;
    }

    public TeaTypes getTeaTypes() {
        return teaTypes;
    }

    public int getIndexArrayTeaType() {
        return indexArrayTeaType;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "teaId=" + teaId +
                ", teaProducer=" + teaProducer +
                ", teaName='" + teaName + '\'' +
                ", teaTypes=" + teaTypes +
                ", indexArrayTeaType=" + indexArrayTeaType +
                '}';
    }
}
