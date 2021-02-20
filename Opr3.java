import java.util.Arrays;

/**
 * Created by shaker on 02/13/2021.
 */
public class Opr3 {
    int[] a = {111, 2, 13, 14, 15};

    public void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i;
            while (i > 0 && curr < arr[j - 1]) {
                arr[j] = arr[j - 1];
                i--;
            }
            arr[j] = curr;
        }

    }

    public static void main(String[] args) {
        Opr3 o = new Opr3();
        System.out.println(Arrays.toString(o.a));
    }
}
