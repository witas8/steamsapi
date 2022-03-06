package Mapping;

import java.util.List;

public class ExampleMaps2 {
    public void run(){
        List<String> myList = List.of("abcd", "qwerty", "asdfgh");

        myList.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .forEach(System.out::println);
    }
}
