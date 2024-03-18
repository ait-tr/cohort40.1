package lesson_44.code.appVariant.service;

import lesson_44.code.appVariant.dto.ClientRequest;
import lesson_44.code.appVariant.dto.ClientResponse;
import lesson_44.code.appVariant.entity.Task;
import lesson_44.code.appVariant.repository.InMemoryRepository;
import lesson_44.code.appVariant.service.validation.ValidationRequest;

import java.util.ArrayList;

public class TaskServiceAddOrUpdate {

    private final InMemoryRepository repository;
    private final ValidationRequest validationRequest;

    public TaskServiceAddOrUpdate(InMemoryRepository repository, ValidationRequest validationRequest) {
        this.repository = repository;
        this.validationRequest = validationRequest;
    }

    public ClientResponse<Task> add(ClientRequest request){

        validationRequest.checkRequest(request);

        Task taskForAdd = new Task(request.getTaskName(), request.getTaskDescription());
        repository.add(taskForAdd);

        if (taskForAdd.getId() > 0) {
            return new ClientResponse<>(200, taskForAdd, "Добавление новой задачи прошло успешно");
        } else {
            return new ClientResponse<>(400, new Task(), "Новая задача не добавлена!");

        }
    }
}
