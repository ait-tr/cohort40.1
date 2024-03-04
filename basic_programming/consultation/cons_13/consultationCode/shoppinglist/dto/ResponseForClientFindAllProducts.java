package consultation.cons_13.consultationCode.shoppinglist.dto;


import consultation.cons_13.consultationCode.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClientFindAllProducts {
    private List<ProductForClient> productForClients;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientFindAllProducts(List<ProductForClient> productForClients, List<ErrorDto> errorDtoList) {
        this.productForClients = productForClients;
        this.errorDtoList = errorDtoList;
    }

    public List<ProductForClient> getProductForClients() {
        return productForClients;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindAllProducts{" +
                "productForClients=" + productForClients +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
