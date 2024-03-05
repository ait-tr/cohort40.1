package consultation.cons_13.consultationCode.shoppinglist.dto;

import consultation.cons_13.consultationCode.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClient <T> {
    private T param;
    private List<ErrorDto> errorDtoList;

    public ResponseForClient(T param, List<ErrorDto> errorDtoList) {
        this.param = param;
        this.errorDtoList = errorDtoList;
    }

    public T getParam() {
        return param;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClient{" +
                "param=" + param +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
