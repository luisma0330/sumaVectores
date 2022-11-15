import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        LeerNumero leerNumero = new LeerNumero();
        NumeroMasGrande numeroMasGrande = new NumeroMasGrande();
        SumaArray sumaArray = new SumaArray();

        n = leerNumero.leerEntero("Escriba el número de espacios para el primer array: ");

        int array1[] = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = leerNumero.leerEnteroFor("Agregar el numero en la posicion " , i);
        }

        m = leerNumero.leerEntero("Escriba el número de espacios para el segundo array: ");

        int array2[] = new int[m];

        for (int i = 0; i < m; i++) {
            array2[i] = leerNumero.leerEnteroFor("Agregar el numero en la posicion " , i);
        }

        int masGrande = numeroMasGrande.masGrande(n,m);

        int array3[] = new int[masGrande];

        sumaArray.suma(array1,array2,array3);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}