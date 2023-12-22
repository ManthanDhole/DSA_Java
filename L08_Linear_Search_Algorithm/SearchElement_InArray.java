import java.util.Scanner;

public class SearchElement_InArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,41,52,63,62,84,85};

        System.out.print("Enter any number to search: ");
        int searchNum = sc.nextInt();

        String ans = SearchNumber_inArray(arr, searchNum);
        System.out.println(ans);
    }

    static String SearchNumber_inArray(int[] arr, int searchNum)
    {
        for (int index = 0; index < arr.length; index++) {
            if(arr.length == 0)
            {
                return "Array is Empty";
            }
            if(arr[index] == searchNum)
            {
                return ("Element " + searchNum + " is present at index " + index);
            }
        }
        return "Element does not exist in the array";
    }
}
