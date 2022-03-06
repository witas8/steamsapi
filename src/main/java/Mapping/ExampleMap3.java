package Mapping;

import java.util.List;

public class ExampleMap3 {
    public void run(){
        //use mapToInt to use map function instead of reduce

        List<String> myList = List.of("abcd", "qwerty", "asdfgh");

        int sum = myList.stream()
                .mapToInt(s -> s.length())
                .sum();

        System.out.println(sum);

    }
}
