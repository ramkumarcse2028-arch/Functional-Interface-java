import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;


public class Function_collector {
    public static void main(String[] args) {    
        
       // List<String> list = new ArrayList<>(List.of("AA", "BBB", "CCCC"));
        /*Map<Integer, String> mp = list.stream()
                                      .collect(Collectors.toMap(
                                       x -> x.length(),
                                       x -> x
                                      ));
        System.out.println(mp);*/

         /*Map<Integer, List < String>> mp = list.stream()
                                              .collect(Collectors.groupingBy(
                                               x -> x.length(),
                                               Collectors.mapping(
                                                x -> x.toLowerCase(), Collectors.toList()) ));
        System.out.println(mp); */


        /*Map<Integer, List < String>> mp = list.stream()
                                      . collect(Collectors.groupingBy( x -> x.length()));
                                      
        System.out.println(mp);*/

        /*String result = list.stream()
                            .collect(Collectors.joining("_"));
        System.out.println(result); */



        List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));

        /*  Map<Boolean, List < Integer>> mp = list.stream()
                                      . collect(Collectors.groupingBy( x -> x % 2 == 0 ));
                                      
        System.out.println(mp);  */

         Map<Boolean, List < Integer>> mp = list.stream()
                                      . collect(Collectors.partitioningBy( x -> x % 2 == 0 ));
                                      
        System.out.println(mp); 


        
        /*Set<Integer> list2 = list.stream()
                                 .map(x -> x + 1)
                                 .collect(Collectors.toSet());

        System.out.println(list2);*/
    }
}


// Collector Method
// toMap(), ToSet(), toList()
// groupingBy()  -> mapping()
// partitioningBy()
// joining()