import java.util.Arrays;

/**
 * Created by shaker on 02/13/2021.
 */
public class Opr2 {
    int [] a ={11,12,13,14,15};

    public int squsearch(int arr[], int value) {
        boolean flage = false;
        int i = 0;
        int index=-1;
        while (i < arr.length && !flage) {
            if (arr[i] == value) {
                flage=true;
                index=i;
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        Opr2 o = new Opr2();
        System.out.println(Arrays.toString(o.a));
        System.out.println(o.squsearch(o.a,15));
    }
}
