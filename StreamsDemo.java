import java.util.*;
public class StreamsDemo {
   public static void main(String[] args) {
        List<Integer> marks = List.of(12, 6, 18, 2, 19);

        marks.stream()
             .filter(m -> {
                 System.out.println("Element " + m);
                 return m > 15;
             })
             .map(m -> m + 3) 
             
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);

        System.out.println(marks); 
   } 
}
