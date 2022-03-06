package Essential;

import java.util.Comparator;
import java.util.stream.Stream;

public class ExampleComp4 {
    public void run(){
        Stream<Dog> dogStream = Stream.of(
                new Dog(25),
                new Dog(24),
                new Dog(56),
                new Dog(11)
        );

        Comparator<Dog> comp = (d1, d2) -> d1.getAge() - d2.getAge();

        System.out.println("Dog Comparison");
        dogStream.sorted(comp)
                .forEach(d -> System.out.println(d.getAge()));
    }



    public static class Dog{
        private int age;

        public Dog(int _age){
            age = _age;
        }

        public int getAge(){
            return this.age;
        }
    }
}
