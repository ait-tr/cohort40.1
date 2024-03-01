package lesson_34.code.lessoncode;

import java.util.LinkedList;

public class MyPriorityQueue {
    private LinkedList<PriorityElement> list;

    public MyPriorityQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(int element, int priority){
        if (list.isEmpty()){
            list.add(new PriorityElement(element,priority));
        } else {
            boolean done = false;

            for (int i = 0; i < list.size(); i++) {
                if (priority > list.get(i).getPriority()){
                    list.add(i,new PriorityElement(element,priority));
                    done = true;
                    break;
                }
            }

            if (!done) {
                list.add(new PriorityElement(element,priority));
            }
        }
    }

    public Integer dequeue(){
        if (list.isEmpty()) {
            return null;
        }
        return list.poll().getElement();
    }
}
