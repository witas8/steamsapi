package Essential;
import java.util.List;

public class ExampleSort1 {
    public void run(){
        List<Integer> myList = List.of(3,4,6,7,8,9,12,5,1,3,5,7,2);

        //sometimes matters order - if distinct is before sort or oposite
        myList.stream()
                .distinct() //as set eliminates repetitions ex. above is number 3 two times
                .sorted() //Comparable, natural order ex. 1,2,3,4
                .forEach(System.out::println);
    }
}
