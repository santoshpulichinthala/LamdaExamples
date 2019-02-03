package Thread;

public class UseRunnable {
    public static  void main(String args[]){
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread 1");
//            }
//        };
//
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread 2");
//            }
//        };


        Runnable r = ()-> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1");
        };
        Runnable r1 = () -> System.out.println("Thread 2");




        new Thread(r).start();

        new Thread(r1).start();

    }
}
