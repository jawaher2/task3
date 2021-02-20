import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by shaker on 02/13/2021.
 */
public class Opr1 {
    int [] a ={11,12,13,14,15};

    public void remove(int arr[],int index){
        if (index>=0 && index<arr.length)
        {
            int i = index;
            while (i<arr.length-1){
                arr[i]=arr[i+1];
                i++;
            }
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        Opr1 o = new Opr1();
        System.out.println(Arrays.toString(o.a));
        o.remove(o.a,2);
        System.out.println(Arrays.toString(o.a));
    }
}
