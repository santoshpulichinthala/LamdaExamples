package lamda;

import lamda.SimpleInterface;

public class UseSimpleInterface {
    public static  void main(String args[]){
        SimpleInterface simpleInterface = (a, b)-> {
            System.out.println("dosomething method"+(a+b));
        };
        simpleInterface.doSomething("5","6");
    }
}
