import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите количество вершин");
        int n = scanner.nextInt();
        int[] array = new int[n + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println("Пишите ребра для графа");
        while (scanner.hasNextInt()) {

            int u = scanner.nextInt();
            int v = scanner.nextInt();

            System.out.println(u + " -> " + v);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == u) {
                    array[i] = v;
                }
            }
        }





        System.out.println("No way with this ribs");
        for (int i = 1; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    System.out.println(i + " -> " + j);
                }
            }
        }
    }
}