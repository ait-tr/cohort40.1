package lesson_44.code.appVariant.service;

import lesson_44.code.appVariant.dto.ClientRequestFind;
import lesson_44.code.appVariant.dto.ClientResponse;
import lesson_44.code.appVariant.entity.Task;
import lesson_44.code.appVariant.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class TaskServiceFind {

    private final InMemoryRepository repository;

    public TaskServiceFind(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ClientResponse<List<Task>> findAll(){
        List<Task> tasks = repository.findAll();

        if (!tasks.isEmpty()) {
            return new ClientResponse<>(200, tasks, "Список задач");
        } else {
            return new ClientResponse<>(250, tasks, "База данных пустая!");
        }
    }

    public ClientResponse<Task> findById(ClientRequestFind<Integer> id){

        Optional<Task> foundedTaskOptional = repository.findById(id.getFindParam());

        if (foundedTaskOptional.isPresent()) {
            return new ClientResponse<>(200, foundedTaskOptional.get(),"Найденный элемент");
        } else {
            return new ClientResponse<>(400, new Task(),"Элемент не найден");
        }
    }

    public ClientResponse<Task> findByName(ClientRequestFind<String> name){

        Optional<Task> foundedTaskOptional = repository.findByName(name.getFindParam());

        if (foundedTaskOptional.isPresent()) {
            return new ClientResponse<>(200, foundedTaskOptional.get(),"Найденный элемент");
        } else {
            return new ClientResponse<>(400, new Task(),"Элемент не найден");
        }
    }
}
