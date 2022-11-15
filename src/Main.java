import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el número de espacios para el primer vector:");
        n = Integer.parseInt(scanner.nextLine());

        int vector1[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Agregar el numero en la posicion: " + i);
            vector1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Escriba el número de espacios para el segundo vector:");
        m = Integer.parseInt(scanner.nextLine());

        int vector2[] = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Agregar el numero en la posicion: " + i);
            vector2[i] = Integer.parseInt(scanner.nextLine());
        }





    }
}