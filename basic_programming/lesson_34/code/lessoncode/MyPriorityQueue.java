package lesson_34.code.lessoncode;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    private LinkedList<PriorityElement> list;

    public MyPriorityQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(int element, int priority){
//        if (list.isEmpty()){
//            list.add(new PriorityElement(element,priority));
//        } else {
//            boolean done = false;
//
//            for (int i = 0; i < list.size(); i++) {
//                if (priority > list.get(i).getPriority()){
//                    list.add(i,new PriorityElement(element,priority));
//                    done = true;
//                    break;
//                }
//            }
//
//            if (!done) {
//                list.add(new PriorityElement(element,priority));
//            }
//        }

        if (list.isEmpty() || priority <= list.getLast().getPriority()){
            list.add(new PriorityElement(element, priority));
        } else {
            int indexInsert = 0;

            while (indexInsert < list.size() && priority <= list.get(indexInsert).getPriority()) {
                indexInsert++;
            }

            list.add(indexInsert, new PriorityElement(element, priority));
        }
    }

    public Integer dequeue(){
        if (list.isEmpty()) {
            return null;
        }
        return list.poll().getElement();
    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "list=" + list +
                '}';
    }
}
