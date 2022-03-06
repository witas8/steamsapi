package Basics;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    //stream creator
    public void run(){
        //avoid null, empty is better
        Stream<Integer> myStream = Stream.empty();
        myStream = Stream.of(1,4,5,8,9,12,15,16);
        myStream.forEach(System.out::println);


        //or with Supplier Interface - that has no input, but return a value
        Supplier<Integer> mySupplier = () -> new Random().nextInt(); //random is for example and it is a infinitive stream
        Stream<Integer> myStreamSup = Stream.generate(mySupplier);
        myStreamSup.limit(10)
                .forEach(System.out::println);


        //UnaryOperation<T>
        Stream<Integer> streamIterated = Stream.iterate(1, i -> i + 1); //1 2 3 4 5 6 7 ...
        streamIterated.limit(10) //up to 10
                .forEach(System.out::println);


        Stream<Integer> integerStream2 = Stream.iterate(1,
                                                            i -> i <=10,
                                                            i -> i +1); //finite stream
        integerStream2.forEach(System.out::println);





    }
}
