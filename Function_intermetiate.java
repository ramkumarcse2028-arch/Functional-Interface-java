import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Function_intermetiate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, 11, 13, 34 ));

        list.stream()
            .filter( x -> x > 10 )
            .map( x -> x * 2 )
            .peek(System.out::println)
           // .sorted((a,b) -> b-a)  //  desending order element  sort  
              .sorted()    // assending order element soeted
              .distinct()
              .skip(1)
            .forEach(System.out::println);  

       /* List<List<Integer>> list2 = List.of(
            List.of(1, 2),
            List.of(3, 4)
        );

        list2.stream()
             .flatMap( x -> x.stream())
             .map( x -> x * 2)
             .forEach(System.out::println); */

        /*Stream.iterate( 1, x -> x+1)
              .limit(  100)
              .skip(50)
              .forEach(System.out::println);  */

    }
}

// Function Intermediate Meathod
// filter()
// flatMap() -> flatening operation
// sorted() -> stateful
// distinct()  -> keep uinique values ( Hashing ) -> stateful
// limit(), skip()
// peek() -> Debugging

