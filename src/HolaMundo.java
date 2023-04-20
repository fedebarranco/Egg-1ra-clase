
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola mundo");
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }

//        var contador = 0;
//        while (contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//
//        }
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 3);
    }
}
