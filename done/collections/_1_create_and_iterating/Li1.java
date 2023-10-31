package done.collections._1_create_and_iterating;

import java.util.HashMap;

public class Li1 {

    public static void main(String[] args) {

        // we create the HashMap with key(Integer) and value(String)
        HashMap<Integer, String> li = new HashMap<>();
        // we add some keys and values to the HashMap
        li.put(1,"aa");
        li.put(2,"bb");

        // now we want to iterate the HashMap to print the keys and the values
        /** option 1: turn the HashMap into a Collection and iterate it with a for loop
        Collection<Integer> keys = li.keySet();

        for (var k : keys) {
        System.out.println(k);
        }

        System.out.println("____________");
        Collection<String> values = li.values();

        for (var v : values) {
        System.out.println(v);
        }
         */

        /** option 2: turn the HashMap into a Stream and iterate first the Keys and then the Values
        li.keySet().stream()
                .forEach(System.out::println);

        System.out.println("____________");

        li.values().stream()
                .forEach(v -> System.out.println(v));
        */

        //* option 3: turn the HashMap into a Stream and iterate the Keys and the Values together
        li.entrySet().stream()
                .forEach(e -> {
                    var k = e.getKey();
                    var v = e.getValue();
                    System.out.println("Key: " + k + " & Value: " + v);
                });

        //* option 4 (best one): with lambda
        li.forEach((k,v) -> System.out.println("Lambda | Key: " + k + " & Value: " + v));


    }
}
