package Essential;

import java.util.stream.Stream;

public class ExampleComp3 {

    public void run(){
        Stream<Cat> catStream = Stream.of(
                new Cat(3),
                new Cat(2),
                new Cat(5),
                new Cat(1)
        );

        System.out.println("Cats' age comparison");
        catStream.sorted() //now sorted knows how to sort
                .forEach(cat -> System.out.println(cat.getAge()));
    }


    public static class Cat implements Comparable<Cat>{
        private int age;

        public Cat(int _age){
            age = _age;
        }

        public int getAge(){
            return this.age;
        }

        public void setAge(int _age){
            this.age = _age;
        }

        @Override
        public int compareTo(Cat c) {
            return this.getAge() - c.getAge();
        }
    }
}
