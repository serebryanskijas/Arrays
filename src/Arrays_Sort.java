import java.util.Arrays;
import java.util.Random;

public class Arrays_Sort {
    // public static int a[] = {6, 3, 2, 4, 8, 5, 1, 7, 9};
    public static int size;
    public static int[] a;
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        size = 15;
        a = new int[size];
        fillRandom();
        buble();
        // gnome();
        printColor(0, 0);


        //bubbleSort
       /* for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1])
                    swap(j, j + 1);
        System.out.println(Arrays.toString(a));*/

        // gnomeSort
       /* for (int i = 1; i < a.length; i++)
            for (int j = i; j > 0 && a[j-1] > a[j]; j--)
                swap(j-1, j);
        System.out.println(Arrays.toString(a));*/

        //insertionSort
        /*for (int i = 1; i < a.length; i++) {
            int spec = a[i];
            int j;
            for (j = i; j > 0 && spec < a[j - 1]; j--)
                a[j] = a[j - 1];
            a[j] = spec;*/

        //


//        System.out.println(Arrays.toString(a));
    }

    public static void buble() {
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - 1 - i; j++)
                if (a[j] > a[j + 1]) {

                    printColor(j, j + 1);
                    swap(j, j + 1);
                }
    }

    public static void gnome() {
        for (int i = 1; i < size; i++)
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                printColor(j - 1, j);
                swap(j - 1, j);
            }
    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void printColor(int first, int second) {
        for (int i = 0; i < size; i++) {
            if (i == first || i == second) {
                System.out.print(ANSI_PURPLE);
                System.out.print(a[i] + " ");
                System.out.print(ANSI_YELLOW);
            } else System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(90) + 10;
        }
    }
}
