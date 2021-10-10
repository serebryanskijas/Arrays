public class Arrays_2D {
    static int nrows = 5;
    static int ncols = 6;
    static int[][] arr = new int[nrows][ncols];
    static int index = 1;

    public static void main(String[] args) {
        //traversal();
        //System.out.println(arrToStringAligned());
        //traversal1();
        //System.out.println(arrToStringAligned());
        //fillDiagonal();
        fillContur(0, nrows - 1, 0, ncols - 1);
        System.out.println(arrToStringAligned());
    }

    //Преобразовать в строку с выравниванием
    public static String arrToStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }

    static void traversal() {
        int index = 1;
        int j = 0;
        for (int i = 0; i < nrows; i++) {
            arr[i][j] = index;
            index++;
            if (i % 2 == 0) j++;
        }

    }

    static void traversal1() {
        int index = 1;
        int i = 0, j = 0;
        arr[0][0] = index++;
        while (j < ncols - 1) {
            if (i == 0)
                i++;

            else {
                i--;
                j++;
            }
            arr[i][j] = index++;

        }
    }

    static void fillDiagonal() {
        int i = 0, j = 0, k = 0, index = 1;
        //arr[0][0] = index++;
        while (k < nrows) {
            i = k;
            j = 0;
            while (i >= 0)
                arr[i--][j++] = index++;
            k++;
        }
        k = 1;
        j = 1;
        while (k < ncols) {
            j = k;
            i = nrows - 1;
            while (j < ncols)
                arr[i--][j++] = index++;
            k++;
        }
    }

    static void fillContur(int fr, int lr, int fc, int lc) {

        if (fr > lr || fc > lc)
            return;
        for (int j = fc; j <= lc; j++)
            arr[fr][j] = index++;
        for (int i = fr + 1; i <= lr; i++)
            arr[i][lc] = index++;
        for (int j = lc - 1; j >= fc; j--)
            arr[lr][j] = index++;
        for (int i = lr - 1; i > fr; i--)
            arr[i][fc] = index++;
        fillContur(fr + 1, lr - 1, fc + 1, lc - 1);
    }
}


