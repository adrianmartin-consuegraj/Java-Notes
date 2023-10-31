package done.collections._2_HashMap;

import java.util.HashMap;

public class Has {

    public static void main(String[] args) {

        // HashMap es una estructura de datos que implementa Map
        // HashMap es una colección que almacena valores pares: Clave (única) & Valor

        // a partir de Java 7 puedes omitir la duplicación de tipos en el lado derecho de la
        // asginación y simplemente escribir el operador diamante "<>"

        //* creating an HashMap
        HashMap<Integer, String> people = new HashMap<>();

        //* put(): you can add elements to the HashMap
        people.put(1, "Antonio");
        people.put(2, "Miguel");

        //* values(): retrieve all the elements from the HashMap
        System.out.println(people.values());

        //* get(): you can retrieve the value using a Key
        System.out.println(people.get(1));

        // iterate an HashMap
        //* keySet(): you can iterate the Keys
        for (Integer k : people.keySet()) {
            System.out.println(k);
        }

        //* values(): you can iterate the Values
        for (String v : people.values()) {
            System.out.println(v);
        }

        // entrySet(): claves - valor
        people.entrySet().stream()
                .forEach(p -> {
                    var k = p.getKey();
                    var v = p.getValue();
                    System.out.println("Key: " + k + " & Values: " + v);
                });

        // expresiones lambdas
        people.forEach((key, value) -> System.out.println("Lambda | Key: " + key + " & Value: " + value));


    }

}
