import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el número de espacios para el primer array:");
        n = Integer.parseInt(scanner.nextLine());

        int array1[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Agregar el numero en la posicion: " + i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Escriba el número de espacios para el segundo array:");
        m = Integer.parseInt(scanner.nextLine());

        int array2[] = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Agregar el numero en la posicion: " + i);
            array2[i] = Integer.parseInt(scanner.nextLine());
        }

        NumeroMasGrande numeroMasGrande = new NumeroMasGrande();

        int masGrande = numeroMasGrande.masGrande(n,m);

        int array3[] = new int[masGrande];

        for (int i = 0; i < array3.length; i++) {
            int valArr1 = 0;
            int valArr2 = 0;

            if (array1.length>i){
                valArr1 = array1[i];
            }

            if(array2.length>i){
                valArr2 = array2[i];
            }

            array3[i] = valArr1 + valArr2;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}