package Mapping;

import java.util.List;

public class ExampleMap4 {
    //flat map example

    //map is used to transform something to stream
    public void run(){
        List<List<Integer>> myList = List.of(
                List.of(1,2,3,4,5),
                List.of(1,2,3),
                List.of(8,9)
        );

        var reducedSum = myList.stream() // List<Integer>
            .flatMap(list -> list.stream()) //int
            .reduce(0, (a,b) -> (a+b));

//        int sum = myList.stream()
//                .flatMapToInt(list -> (IntStream) list.stream()) //nie dziala
//                .sum();

//        System.out.println(sum);
    }

}
