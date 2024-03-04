package lesson_35.code.lessoncode.responseReqestModelDTO.dto;

import java.util.List;

public class ResponseForClientAddProduct {
    private boolean isOk;
    private List<String> errors;

    public ResponseForClientAddProduct(boolean isOk, List<String> errors) {
        this.isOk = isOk;
        this.errors = errors;
    }

    public boolean isOk() {
        return isOk;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "ResponseForClientAddProduct{" +
                "isOk=" + isOk +
                ", errors=" + errors +
                '}';
    }
}
