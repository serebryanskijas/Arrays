public class Arrays1 {

    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        fillOrder();
        print();
        System.out.println(sum());
    }

    public static void fillOrder() {
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
    }

    public static void print() {
        for (int element : arr)  //вывод всех элементов массива
            System.out.print(element + " ");
        System.out.println();
//        for (int i = 0; i < size; i++)
//            System.out.println(arr[i]);
    }

    public static int sum() {
        int sum = 0;
        for (int element : arr)
            sum += element;
            return sum;

    }
}
