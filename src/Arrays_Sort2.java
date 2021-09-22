import java.util.Random;

public class Arrays_Sort2 {
    public static int size = 10;
    public static int[] a;
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        size = 4;
        a = new int[size];
        fillRandom();
        //selectionSort();
        //combSort();
        bogoSort();
        printColor(0, 0);
    }

    public static void selectionSort() {
        for (int i = 0; i < size; i++) {
            int min = a[i], index = 0;
            for (int j = i; j < size; j++)
                if (min > a[j]) {
                    min = a[j];
                    index = j;
                }
            if (index != 0) {
                printColor(i, index);
                swap(i, index);
            }
        }
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(90) + 10;
        }
    }

    public static void printColor(int first, int second) {
        for (int i = 0; i < size; i++) {
            if (i == first || i == second) {
                System.out.print(ANSI_BLUE);
                System.out.print(a[i] + " ");
                System.out.print(ANSI_YELLOW);
            } else System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void combSort() {
        double factor = 1.2473309; // фактор уменьшения
        int step = a.length - 1; // шаг сортировки
        while (step >= 1) {
            for (int i = 0; i + step < a.length; i++)
                if (a[i] > a[i + step]) {
                    printColor(i, i + step);
                    swap(i, i + step);
                }
            step /= factor;
        }
    }

    public static void bogoSort() {
        while (!isSorted())
            shuffle();
    }

    public static boolean isSorted() {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    public static void shuffle() {
        Random random = new Random();
        for (int i = 0; i < a.length; i++){
            int index = random.nextInt(a.length);
            printColor(i, index);
            swap(i, index);}
    }


}
