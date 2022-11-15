import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerNumero {
    Scanner sc = new Scanner(System.in);

    public int leerEntero(String s) {
        boolean repetir;
        int n=0;
        do {
            repetir = false;
            try {
                System.out.print(s);
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es válido");
                repetir = true;
            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }

    public int leerEnteroFor(String s, int i){
        boolean repetir;
        int n=0;
        do {
            repetir = false;
            try {
                System.out.print(s + i + ":");
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es válido");
                repetir = true;
            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
}
