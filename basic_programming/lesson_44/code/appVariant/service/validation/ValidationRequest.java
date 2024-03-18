package lesson_44.code.appVariant.service.validation;

import lesson_44.code.appVariant.dto.ClientRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidationRequest {
    public boolean checkRequest(ClientRequest request){
        /*
        name != null
        name.length > 5 && < 15

        description != null
        description.length > 5 && < 30

         */

        List<String> errors = new ArrayList<>();

        if (request.getTaskName().isBlank()) errors.add("Task name must be not null \n");
        if ((request.getTaskName().length() < 5) || (request.getTaskName().length() > 15)) errors.add("Task name length must be between 5 and 15 letters \n");

        if (request.getTaskDescription().isBlank()) errors.add("Task description must be not null \n");
        if ((request.getTaskDescription().length() < 5) || (request.getTaskDescription().length() > 30)) errors.add("Task description length must be between 5 and 30 letters \n");

        if (!errors.isEmpty()) throw new ValidationException(errors.toString());

        return true;

    }

}
