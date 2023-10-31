package done.type_inference;

public class Ej4 {

    //! "var" cannot be used in class attributes
    // var int = 0;

    public static void main(String[] args) {

        // the particle "var" is used as a wildcard,
        // so you can create any variable using "var" in place of the exact name for the variable (like int, String or long)
        var array = new int[] {3,4,5};

        for (var i : array) {
            System.out.println(i);
        }

    }

}
