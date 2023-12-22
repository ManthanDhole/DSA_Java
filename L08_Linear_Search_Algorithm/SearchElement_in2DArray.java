public class SearchElement_in2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,43,63,13},
                {87,59,98,86,18},
                {74,57,19}
        };

        int[][] ar = {};
        int elementToSearch = 6;
        System.out.println(search_in2DArray(ar, elementToSearch));
    }

    static String search_in2DArray(int[][] arr, int elementToSearch)
    {
        if(arr.length == 0)
        {
            return "Array is empty";
        }
        for (int[] array: arr)
        {
            for(int i: array)
            {
                if(elementToSearch == i)
                {
                    return ("The Element " + elementToSearch + " exists");
                }
            }
        }
        return ("The Element " + elementToSearch + " doesn't exists");
    }
}
