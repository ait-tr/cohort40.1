package lesson_22.code.lessoncode.task1Var2;

abstract class Tea {
    private int teaId;
    private TeaProducer teaProducer;
    private String teaName;
    private String teaType;

    public Tea(int teaId, TeaProducer teaProducer, String teaName, String teaType) {
        this.teaId = teaId;
        this.teaProducer = teaProducer;
        this.teaName = teaName;
        this.teaType = teaType;
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

    public String getTeaType() {
        return teaType;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "teaId=" + teaId +
                ", teaProducer=" + teaProducer +
                ", teaName='" + teaName + '\'' +
                ", teaType='" + teaType + '\'' +
                '}';
    }
}
