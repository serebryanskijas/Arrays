import java.util.Arrays;

public class Arrays_Sort {
    public static int a[] = {6, 3, 2, 4, 8, 5, 1, 7, 9};

    public static void main(String[] args) {

        //bubbleSort
   /*     for (int i = 0; i < a.length - 1; i++)
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
        for (int i = 1; i < a.length; i++) {
            int spec = a[i];
            int j;
            for (j = i; j > 0 && spec < a[j - 1]; j--)
                a[j] = a[j - 1];
            a[j] = spec;

        //
        }

        System.out.println(Arrays.toString(a));
    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
