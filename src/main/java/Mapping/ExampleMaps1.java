package Mapping;

import java.util.List;

public class ExampleMaps1 {
    //map is used to transform something to something
    public void run(){
        List<String> myList = List.of("abcd", "qwerty", "asdfgh");

        //map is to change one input to specific output
        //ex. mapToDouble, mapToInt, mapToInt
        var sum = myList.stream()
                .map(myString -> myString.length()) //4, 6, 5
                .reduce(0, (a, b) -> (a+b)); //terminal operation (init_value_of_previous_result, (sum))

        System.out.println(sum);
    }
}
