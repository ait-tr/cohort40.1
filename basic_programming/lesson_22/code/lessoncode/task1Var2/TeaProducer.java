package lesson_22.code.lessoncode.task1Var2;

public class TeaProducer {

    private String producerName;

    public TeaProducer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return "TeaProducer{" +
                "producerName='" + producerName + '\'' +
                '}';
    }
}
