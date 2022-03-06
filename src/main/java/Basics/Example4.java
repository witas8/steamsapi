package Basics;

import java.util.List;

public class Example4 {
    public void run(){
        List<Integer> list = List.of(1,5,6,8,9,12);

        list.stream()
                .forEach(x -> myMethod(x));
    }

    static void myMethod(int x){
        if(x % 2 == 0){
            throw new RuntimeException("X is even");
        }
        System.out.println("X is odd");
    }
}
