import java.util.Arrays;

public class Arrays2 {


    public static void main(String[] args) {
        //Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
        Arrays1.fillRandom();
        Arrays1.arr[1] = 65;
        Arrays1.arr[6] = 65;
        Arrays1.print();
        int[] temp = new int[Arrays1.arr.length];
        temp[0] = Arrays1.arr[0];
        int count = 1;
        for (int i = 1; i < Arrays1.arr.length; i++) {
            boolean flag = false;
            for (int j =0; j < count; j++)
                if (Arrays1.arr[i] == temp[j]) flag = true;
            if (!flag) {
                temp[count] = Arrays1.arr[i];
                count++;
            }
        }
//        System.out.println(Arrays.toString(temp)); //вывод всего массива
        for (int i =0; i<count; i++)
            System.out.print(temp[i]+ ", ");
    }
}
