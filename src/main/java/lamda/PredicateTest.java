package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String args[]){

        List<Person> list = new ArrayList<Person>();

        list.add(new Person("santosh",23));
        list.add(new Person("sandeep",50));

//        java.util.function.Predicate<Person>  predicate = new java.util.function.Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge()>24;
//            }
//        };

        Predicate<Person> predicate = (p)->p.getAge()>=24;

//        Consumer<Person> cons = new Consumer<Person>() {
//            @Override
//            public void accept(Person list) {/*˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙˙*/
//
//            }
//        };


//      for(Person p : list){
//         if( predicate.test(p))
//         {
//             System.out.println(p.getName());
//         }
//      }


        list.forEach(pre->{

            if(predicate.test(pre)){
                System.out.println(pre.getName());
            }

        });


        Runnable r = ()-> System.out.println("thread");

        new Thread(r).start();








    }
}
