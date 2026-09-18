import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.OptionalDouble;

public class Function_Terminate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));
       /*  list.stream()
            .map(x -> x + 1)
            .forEach(System.out::println);  */

       /*  List<Integer>list2 = list.stream()
            .map(x -> x + 1)
            .toList();
        System.out.println(list2); */

       /*  Set<Integer> set = list.stream()
            .map(x -> x + 1)
            .collect(Collectors.toSet());
            
        System.out.println(set);*/

       /*  Optional<Integer> sum = list.stream()
            .reduce((a,b) -> a + b);
        System.out.println(sum.get());  */

        /*int sum = list.stream()
                      .reduce(0, (a,b) -> a+b);
        System.out.println(sum);  */

        /*Optional<Integer> num = list.stream()
            .filter( x -> x > 10)
            .findAny();
        System.out.println(num.get());  */

       /* boolean num = list.stream()
            .filter(x  -> x > 10 )
            .anyMatch( x -> x % 2 == 0);  // allMatch , noneMatch
        System.out.println(num);  */

        /*int sum = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .sum();
        System.out.println(sum);  */

        OptionalDouble  avg  = list.stream()
            .filter( x -> x > 10)
            .mapToInt(x -> x )
            .average();
        System.out.println(avg.getAsDouble());
    }
}

// Terminate Method
// forEach(), forEachOrdered(0
// toList()
// Collect()  -> Collector
// reduce()  ->  combine stream element into single value
// count() 
// findFirst()  -> short circuting
// findAny()
// anyMatch, AllMatch, noneMatch
//  sum(), average(), max, min()  ->  primitive
