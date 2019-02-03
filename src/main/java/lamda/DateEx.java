package lamda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
    public static void  main(String args[]){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        String formatDateTime = localDateTime.format(formatter);
        System.out.println("hello world: "+formatDateTime);
    }
}
