package Basics;

import java.util.List;

public class Example1 {

    //Function<T,R> is an operation where T is input and R is output ex. map
    //Function<T,T> is better to use UnaryOperation<T> so the same type of input and output ex. iterate
    //Function<T,Boolean> is a Predicate Interface that returns true or false - filter ex. filter

    public void run(){
        List<Integer> numbersList = List.of(1,4,5,6,7,9); // - source

        //instead of doing this:
        System.out.println("Old version:");
        for(Integer i : numbersList){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //do this:
        //use Predicate Interface that returns true or false - filter
        //use Consumer Interface that consume a value but do not return anything - forEach
        System.out.println("\nWith streams:");
        numbersList.stream()
                .filter(num -> num % 2 == 0) // - intermediate operation
                // the same as:forEach(num -> System.out.println(num));
                .forEach(System.out::println); // - terminal operation

        // another terminal operation can be collect() that returns a collection that can be easily changed to map for ex.
        //Map<String, Integer> result = givenList.stream()
        //  .collect(toMap(Function.identity(), String::length))
    }
}
