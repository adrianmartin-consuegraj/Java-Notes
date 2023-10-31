package done.autoboxing_unboxing;

public class Ej1 {

    public static void main(String[] args) {

        //1. autoboxing
        // se puede asignar directamemte el tipo primitivo a la variable aobjeto (autoboxing):
        Integer ent = 200; //autoboxing
        Double db = 45.7; //autoboxing

        //2. unboxing
        // se puede recuperar el tipo primitivo asignando directamente la variable objeto a la variable primitiva (unboxing):
        int n = ent; //unboxing
        Integer k = 30; //autoboxing
        k++; //unboxing + autoboxing

    }

}
