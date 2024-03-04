package consultation.cons_13.consultationCode.shoppinglist.dto;

import consultation.cons_13.consultationCode.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClientForDelete {
    private boolean deleteResult;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientForDelete(boolean deleteResult, List<ErrorDto> errorDtoList) {
        this.deleteResult = deleteResult;
        this.errorDtoList = errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientForDelete{" +
                "deleteResult=" + deleteResult +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
