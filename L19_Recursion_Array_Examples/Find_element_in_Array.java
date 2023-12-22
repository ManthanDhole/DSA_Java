import java.util.ArrayList;
import java.util.Arrays;

public class Find_element_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,2,3,8};
        int target = 3;
        int index = 0;

        int elementFoundAtIndex = findElementInArray(arr, target, index);
        System.out.println("Element is at Index: " + elementFoundAtIndex);

        boolean elementExists = elementExistsInArray(arr, target, index);
        System.out.println("Element exists: " + elementExists);

        ArrayList<Integer> elementsAtIndexes = findAllElementInArray(arr, target,index, new ArrayList<Integer>());
        System.out.println("Element is at indexes: " + elementsAtIndexes.toString());

        //Not passing ArrayList as argument
        ArrayList<Integer> elementsAtIndexesNoArrayListInArgs = findAllElementInArray(arr, target, index);
        System.out.println("Element is at indexes: " + elementsAtIndexesNoArrayListInArgs);
    }
    public static int findElementInArray(int[] arr, int target, int index)
    {
        if(index == arr.length-1) return -1;
        if(arr[index] == target)
        {
            return index;
        }
        return findElementInArray(arr, target, index+1);
    }
    public static boolean elementExistsInArray(int[] arr, int target, int index)
    {
        if(index == arr.length-1) return false;
        return arr[index] == target || elementExistsInArray(arr, target, index+1);
    }

    //If there are multiple same number which are target then return ArrayList of all the indexes
//    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static ArrayList<Integer> findAllElementInArray(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if(index == arr.length-1) return list;
        if(arr[index] == target)
        {
            list.add(index);
        }
        return findAllElementInArray(arr, target, index+1, list);
    }
    //If you don't want to pass ArrayList as parameter. Initialize it in the function and pass it down and merge all the
    //answers while returning from the recursive calls
    public static ArrayList<Integer> findAllElementInArray(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length-1) return list;
        if(arr[index] == target)
        {
            list.add(index);
        }
        list.addAll(findAllElementInArray(arr, target, index+1));
        return list;
    }
}
