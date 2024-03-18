package lesson_44.code.appVariant.repository;

import lesson_44.code.appVariant.entity.Task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface InMemoryRepository {

    public Task add(Task newTask);

    public Optional<Task> findById(Integer id);

    public Optional<Task> findByName(String taskName);

    public List<Task> findAll();

}
