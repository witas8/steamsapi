package Essential;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleCollector7 {
    public void run(){
        List<Integer> input = List.of(1,4,5,6,7,9,12,13,16,17,20);

        List<Integer> output = input.stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());

    }
}
