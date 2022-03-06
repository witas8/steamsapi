package Essential;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComp2 {
    public void run(){
        List<Integer> myList = List.of(3,4,6,7,8,9,12,5,1,3,5,7,2);

        Comparator<Integer> myComparator = Collections.reverseOrder();
        myList.stream()
                .distinct()
                .sorted(myComparator)
                .forEach(System.out::println);
    }
}
