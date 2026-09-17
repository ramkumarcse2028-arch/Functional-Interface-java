import java.util.Optional;

public class Function_Optional {
    public static void main(String[] args) {


        Optional<String> name = getName();
      //  System.out.println(name.get());

      /*if(name.isPresent()){
            System.out.println(name.get());

      }*/
      //name.ifPresent(System.out::println);
     // System.out.println(name.orElse("Unknow"));

      //System.out.println(name.orElseGet(()  -> "Unknown"));

     // System.out.println(name.orElseThrow());  // Exception in thread "main" java.util.NoSuchElementException: No value present
        name.ifPresentOrElse(System.out::println, () -> System.out.println("Unknow"));
    }
    public static Optional<String> getName(){  
      // return Optional.of("Aditya");    
      // return Optional.empty(); //Exception throws
      return Optional.ofNullable(null);
    }
}





