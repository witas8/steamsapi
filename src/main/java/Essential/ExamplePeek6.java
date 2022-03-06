package Essential;

import java.util.List;

public class ExamplePeek6 {
    public void run(){
        List<Integer> numbersList = List.of(1,4,5,6,7,9,12,13,16,17,20);

        //peak is consumer, so takes a value, but do not return anything
        System.out.println("Peak example to print, but do not terminate:");
        numbersList.stream()
                .peek(System.out::println) //can be print, but it is not a termination function
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); //print and finish

//        //NOT RECOMMENDED is to peak and add - use collector instead (RECOMMENDED)
//        List<Integer> input = List.of(1,4,5,6,7,9,12,13,16,17,20);
//        List<Integer> output = new ArrayList<>();
//        System.out.println("Peak example with two lists:");
//        numbersList.stream()
//                .filter(n -> n % 2 == 0)
//                .peek(n -> output.add(n))
//                .forEach(System.out::println); //print and finish
    }
}
