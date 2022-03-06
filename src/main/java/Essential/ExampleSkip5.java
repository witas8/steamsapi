package Essential;

import java.util.List;

public class ExampleSkip5 {
    public void run(){
        List<Integer> numbersList = List.of(1,4,5,6,7,9,12,13,16,17,20);

        System.out.println("Skip example:");
        numbersList.stream()
                .filter(n -> n % 2 == 0) //filter to even values
                .skip(3) //skip first three values
                .forEach(System.out::println);
    }
}
