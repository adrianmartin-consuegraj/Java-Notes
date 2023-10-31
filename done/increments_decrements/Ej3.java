package done.increments_decrements;

public class Ej3 {

    public static void main(String[] args) {

        // option 1: "b" is assigned to "c" and then one is subtracted, but that subtraction is lost
        int a=3, b=5, c;

        c = (a>b) ? a*a : b--;
        System.out.println("the value of c is: " + c);

        // option 2: subtract one from "e" and then assign "e" to "f"
        int d=3, e=5, f;

        f = (d>e) ? d*d : --e;
        System.out.println("the value of f is: " + f);

    }

}
