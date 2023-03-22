import java.util.Scanner;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        showSpaces();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese un numero: ");
            String numero = scanner.nextLine();
            if (numero.equals("exit")) {
                break;
            }
            NumeroEntero n1 = new NumeroEntero();
            n1.set(Long.parseLong(numero));
            System.out.println(n1);
            System.out.println("Cantidad de digitos: " + n1.cantidadDigitos());
            System.out.println();

            // cantidad de digitos pares
            System.out.println(n1.cantidadDigitosPares());
        }
        scanner.close();
        showSpaces();

        System.out.println("");

        System.out.println("");

        System.out.println("");
    }

    public static void showCharacter(String s) {
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }

    public static void showSpaces() {
        for (int i = 0; i < 2; i++) {
            System.out.println("");
        }
    }

    public static void nuevaFuncion() {
        System.out.println("");
    }
}
