import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>(10);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
//        arr.add(39);
//
//        arr.set(3, 67);
//        arr.remove(2);
//        System.out.println(arr.toString());
//        System.out.println(arr.get(3));

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            arr.add((i+1) * 10);
        }
        System.out.println("Capacity 1: " + arr.size());
        for (int i = 5; i < 20; i++) {
            arr.add((i+1) * 10);
        }
        System.out.println("Capacity 2: " + arr.size());
        for (int i = 0; i < 20; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\n" + arr.contains(180));
        System.out.println(arr.indexOf(140));

        System.out.println(arr.size());
//        System.out.println(arr);

    }
}
