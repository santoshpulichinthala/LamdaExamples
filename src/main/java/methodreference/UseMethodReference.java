package methodreference;

import lamda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseMethodReference {


  public static void main(String arg[]) {
      List<Person> list = new ArrayList<>();

      list.add(new Person("santosh",11));
      list.add(new Person("sandy",22));
      list.add(new Person("sandhya",33));

      Predicate<Person> personPredicate = new Predicate<Person>() {
          @Override
          public boolean test(Person person) {
              return person.getAge()>22;
          }
      };

      for(Person p:list){
          if(personPredicate.test(p)){
              System.out.println(p.toString());
          }
      }
  }


}
