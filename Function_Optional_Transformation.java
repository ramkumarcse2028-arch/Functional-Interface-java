import java.util.Optional;
public class Function_Optional_Transformation {
    public static void main(String[] args) {
       /*  User user = getUser();
        if (user !=null) {
            Address address = user.address;
            if(address != null){
                String city = address.city;
                if(city != null){
                    System.out.println(city);
                }
            }

        }*/
       /* Optional<User> user = getUser();

        user.flatMap(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out::println);*/

       // Optional <String> name = Optional.of("Ram");
       // Optional<String> result = name.filter(x -> x.length() > 10);

       //Optional<String> result = name.filter(x -> x.length() > 2);

        //System.out.println(result.orElse("Empty"));

       Optional<String> name = Optional.of("Ram");

        name.map(x -> x.length())
            .filter(len -> len > 2)
            .ifPresent(System.out::println);
    }

    //private static User getUser() {
   private static Optional<User> getUser() {
    Address a = new Address();
    a.city = "Delhi";

    User u = new User();
    u.address = Optional.of(a);

    return Optional.of(u);
}

}

class User{
   // public Address address;
    public Optional  <Address> address;
}

class Address{
    public String city;
}
