package Essential;

import java.util.List;

public class ExampleWhileDrop9 {
    public void run(){
        List<Integer> numbersList = List.of(1,4,5,6,7,9,12,13,16,17,20);

        numbersList.stream()
                .dropWhile(n -> n <= 15) //opposite of take while. take values when the condition will be false - so answer - 16, 17, 20
                .forEach(System.out::println);
    }
}
