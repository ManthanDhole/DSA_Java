import java.awt.*;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

//        for(int i : arr)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        String[] str = new String[5];
        str[0] = "Manthan";
        str[1] = "Dhole";
        str[2] = "Infor";
//        for(String i: str)
//        {
//            System.out.print(i + " ");
//        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr));
    }
}
