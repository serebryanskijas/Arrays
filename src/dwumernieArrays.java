import java.util.Arrays;

public class dwumernieArrays {

    private static int numRows = 5;
    private static int numCols = 6;
    private static int[][] arr = new int[numRows][numCols];

    public static void main(String[] args) {
        //fillOrder();
        //fillOrderUpDown();
        fillSnake();
        System.out.println(arrToString());
        System.out.println(arrToStringAlign());


    }

    public static void fillOrder() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = i * numCols + j + 1;
                //         System.out.print(arr[i][j] + "\t");
            }
            //   System.out.println();

        }

    }
    public static void fillOrderUpDown() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = j * numRows + i + 1;
            }
        }
    }

    public static String arrToString() {
        StringBuilder result = new StringBuilder();
        String separator = ",";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
                if (j != arr[i].length)
                    result.append(separator);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static String arrToStringAlign() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                String sNumber= Integer.toString(arr[i][j]);
                String sPad = pad.substring(sNumber.length())+sNumber;
                result.append(sPad);
                }

            result.append("\n");
        }
        return result.toString();
    }

    public static void fillSnake() {
        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numCols; j++)
                    arr[i][j] = i * numCols + j + 1;
            } else for (int j = numCols - 1; j >= 0; j--)
                arr[i][j] = i * numCols + (numCols - j);
        }
    }


}
