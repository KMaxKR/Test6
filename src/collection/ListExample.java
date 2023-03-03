package collection;
import java.util.*;

import java.util.ArrayList;

public class ListExample {

    String[] array = {"K. Max", "Unaverange"};
    List<String> list = new ArrayList<>();
    public void traverseList(){
        list.add("Arrr");
        list.add("JFdh");
        list.remove("Arrr");
        for (String x : list){
            System.out.println(x);
        }

        boolean contain = list.contains("Arrr");

        List<String> secondList = new ArrayList<>();
        secondList.addAll(list);
        secondList.add("K. Max");
    }
}
