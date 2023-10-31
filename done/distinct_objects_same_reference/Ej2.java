package done.distinct_objects_same_reference;

public class Ej2 {

    public static void main(String[] args) {

        // we create two object of the class Person which are initialize with the value "default" as name
        Person p2 = new Person();
        Person p1 = new Person();
        p1.name = "Antoniou";

        System.out.println("P1 nombre: " + p1.getName());
        System.out.println("P2 nombre: " + p2.getName());

        // we create the object p3 directly by pointing at p2
        Person p3 = p2;
        // if we change p2, p3 will automatically change as well
        p2.setName("Justin Case");
        System.out.println("\nname value for p2: " + p2.getName());
        System.out.println("name value for p3: " + p3.getName());


    }

}
