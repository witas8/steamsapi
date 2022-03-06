package Basics;

import java.util.List;

public class Example3 {
    public void run(){
        List<Integer> list = List.of(1,5,6,8,9,12);

        //an input to the anyMatches is a Predicate Interface that return boolean value
        //match is a terminate function
        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0); //at least one value that pass the rule (here true)
        boolean b2 = list.stream().allMatch(x -> x % 2 == 0); //all value have to pass the rule (here false)
        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0); //no values pass the rule (here false)
    }
}
