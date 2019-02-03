package Practice;

import java.util.ArrayList;

public class ArrayListLamda {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("world");

        list.forEach(s-> System.out.println(s));
    }


}
