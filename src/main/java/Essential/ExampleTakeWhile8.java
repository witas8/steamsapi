package Essential;

import java.util.List;

public class ExampleTakeWhile8 {
    public void run(){
        List<Integer> numbersList = List.of(1,4,5,6,7,9,12,13,16,17,20);

        numbersList.stream()
                .takeWhile(n -> n <= 15) //condition when to stop - while(condition), so answer - 1, 4 ..., 13
                .forEach(System.out::println);
    }
}
