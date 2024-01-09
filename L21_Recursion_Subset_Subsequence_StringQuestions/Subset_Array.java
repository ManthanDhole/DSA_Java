import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_Array {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        List<List<Integer>> ans = subset(arr);

        int[] arr = {2,1,2};
        Arrays.sort(arr); //to prevent adding duplicates in unordered manner
        List<List<Integer>> ans = subset_duplicateNumbers(arr);

        for(List<Integer> list: ans)
        {
            System.out.print(list + " ");
        }
    }

    public static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        //Initially we need to have an empty list
        outer.add(new ArrayList<>());

        for(int num: arr)
        {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                //Copy the i th list from the outer array and then add the element in that outer array
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //Sort the array before using the following function. Duplicates need to be together
    //or else they would be added as unordered duplicates
    public static List<List<Integer>> subset_duplicateNumbers(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        //Initially we need to have an empty list
        outer.add(new ArrayList<>());

        for(int num: arr)
        {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                //Copy the i th list from the outer array and then add the element in that outer array
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal))
                {
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
