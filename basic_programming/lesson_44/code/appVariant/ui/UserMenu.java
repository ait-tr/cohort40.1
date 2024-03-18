package lesson_44.code.appVariant.ui;

import lesson_44.code.appVariant.dto.ClientRequest;
import lesson_44.code.appVariant.dto.ClientRequestFind;
import lesson_44.code.appVariant.service.TaskServiceAddOrUpdate;
import lesson_44.code.appVariant.service.TaskServiceFind;
import lesson_44.code.appVariant.service.validation.ValidationException;

public class UserMenu {

    private final TaskServiceAddOrUpdate addOrUpdate;
    private final TaskServiceFind serviceFind;

    public UserMenu(TaskServiceAddOrUpdate addOrUpdate, TaskServiceFind serviceFind) {
        this.addOrUpdate = addOrUpdate;
        this.serviceFind = serviceFind;
    }

    public void menu(){

      try {
          ClientRequest request1 = new ClientRequest("task1", "description1");
          ClientRequest request2 = new ClientRequest("task2", "description2");
          ClientRequest request3 = new ClientRequest("task3", "description3");
          ClientRequest request4 = new ClientRequest("t3", "descrcxzbzxbzxbzxbzxbzxbzxbzxbzxnzxniption3");


          addOrUpdate.add(request1);
          addOrUpdate.add(request2);
          addOrUpdate.add(request3);
          //addOrUpdate.add(request4);

          System.out.println(serviceFind.findAll());

          ClientRequestFind<String> requestFind1 = new ClientRequestFind<>("");
          ClientRequestFind<Integer> requestFind2 = new ClientRequestFind<>(1);
          ClientRequestFind<String> requestFind3 = new ClientRequestFind<>("task2");

          System.out.println("---- поиск по id -----");
          System.out.println(serviceFind.findById(requestFind2));

          System.out.println("---- поиск по name -----");
          System.out.println(serviceFind.findByName(requestFind1));
          System.out.println(serviceFind.findByName(requestFind3));

      } catch (ValidationException e) {
          System.out.println(e.getMessage());
      }

    }
}
