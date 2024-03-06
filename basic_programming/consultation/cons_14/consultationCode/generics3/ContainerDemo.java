package consultation.cons_14.consultationCode.generics3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerDemo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        Map<Integer,String> map = new HashMap<>();

        //=========

        Container<List<String>> container1 = new Container<>(strings);

        Container<Map<Integer, String>> container2 = new Container<>(map);

        Container<Double> container3 = new Container<>(10.5);



    }
}
