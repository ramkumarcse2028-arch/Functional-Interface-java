import java.util.List;
import java.util.stream.Stream;

public class Streams1Demo {
    public static void main(String[] args) {
        List<Integer> marks = List.of(12, 19, 16, 14, 16, 18, 2);
        Stream<Integer> myStream = marks.stream();
        System.out.println(myStream
                    .filter(m -> m>15)
                    .map(m -> m + 3)
                    .sorted()
                    //.count()
                    .reduce(1, (a,b) -> a+b)
                    );
        //myStream.forEach(System.out::print);
        System.out.println(marks);
    }
}
