package Mapping;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    //add all digits that are placed in strings
    public void run(){
        List<String> myList = List.of("fasysa245", "aa6346gtsd", "gsg", "gdsdsa332x");

        long result = 0;
        String digits = "0123456789";
        result = myList.stream() //Sting
            .flatMap(s -> Arrays.stream(s.split(""))) //String
            .filter(s -> digits.contains(s))
                .count();

        System.out.println(result);
    }
}
