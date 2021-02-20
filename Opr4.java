import java.util.Arrays;
import java.util.Random;

/**
 * Created by shaker on 02/13/2021.
 */
public class Opr4 {
    int[] a = {111, 2, 13, 14, 15};
    int[] b ={1,1};
    public void fillRandom(int arr[]){
        Random r = new Random(4);
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=r.nextInt(101);
        }
    }

    public static void main(String[] args) {
        Opr4 o = new Opr4();
        System.out.println(Arrays.toString(o.a));
        o.b= Arrays.copyOf(o.a,o.a.length);
        Arrays.sort(o.a);
        System.out.println(Arrays.toString(o.a));
        System.out.println(Arrays.binarySearch(o.a,12));
    }

}
