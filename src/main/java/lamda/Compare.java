package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Compare {

    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("CCC");
        list.add("bbb");

        Collections.sort(list);

//        for(String val : list){
//            System.out.println("Values"+val);
//        }

        list.forEach(inttt-> System.out.println(inttt));


        Comparator<String> compare = (a,b)->{
            return a.compareToIgnoreCase(b);
        };

        Collections.sort(list,compare);

        list.forEach(str-> {
            System.out.println(str);
            System.out.println("new line");

        });

    }
}
