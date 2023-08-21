import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        //Add new ArrayList<Integer> in the first ArrayList
        //Initialize the main ArrayList<> with ArrayList<Integer> in it
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<Integer>());
        }

        //Iterate through first ArrayList
        for (int i = 0; i < 3; i++) {
            //Iterate through second ArrayList
            for (int j = 0; j < 3; j++) {
                //Get the first ArrayList and then add the element in the second ArrayList
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr);
    }
}
