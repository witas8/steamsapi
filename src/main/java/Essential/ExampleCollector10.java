package Essential;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleCollector10 {
    public void run(){
        List<Integer> collectedList = Stream.of(1, 2, 3, 4, 5, 6, 8, 9)
                .map(n -> 2 * n)
                //.distinct() //if i do not want to have duplications
                .collect(Collectors.toList()); //or toSet

        System.out.println(collectedList);
    }
}
