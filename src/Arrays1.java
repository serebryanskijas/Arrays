import com.sun.jdi.Value;

import java.util.Random;

public class Arrays1 {

    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
//        fillOrder();
        fillRandom();
        arr[9] = 65;
        print();

        System.out.println(find(65));
//        revers();
//        print();
//        arr = new int [] {61,3,55,88,4,44,78,21,32,12}; //ручное заполнение массива
        System.out.println(sum());
        System.out.println(max());

    }

    public static void fillOrder() {
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(90) + 10;
        }
    }

    public static void print() {
        for (int element : arr)  //вывод всех элементов массива
            System.out.print(element + " ");
        System.out.println();
//        for (int i = 0; i < size; i++)
//            System.out.println(arr[i]);
    }

    public static int sum() { //сумма всех элементов массива
        int sum = 0;
        for (int element : arr)
            sum += element;
        return sum;
    }

    public static int max() { //максимальное значение массива
        int max = arr[0];
        for (int i = 1; i < size; i++)
            if (max < arr[i]) max = arr[i];
        return max;
    }

    public static void revers() { //перестановка элементов массивов
        for (int i = 0; i < size / 2; i++)
            swop(i, size - i - 1);
    }

    public static void swop(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int find(int element) {// Найти элемент в массиве
        int index = -1;
        for (int i = 0; i < size; i++)
            if (arr[i] == element)
                index = i;
        return index;
    }

}

