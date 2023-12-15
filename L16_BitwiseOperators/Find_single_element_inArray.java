public class Find_single_element_inArray {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,3,1,6,2,4};
//        int[] arr = {-4,-1,-3,-2,3,1,6,2,4};
        XORArrayTOFindSingleElement(arr);
    }

    public static void XORArrayTOFindSingleElement(int[] arr)
    {
        int ans = 0;
        for(int num : arr)
        {
//            System.out.print(num + " ");
            ans = ans ^ num;
        }
//        for(int i = 0; i < arr.length-1; i++)
//        {
//            ans = arr[i] ^ arr[i+1];
//            //This will XOR all the elements
//            //4^1^3^2^3^1^6^2^4 => This will cancel all the duplicate elements as 1^1=0, 2^2=0, 3^3=0, 4^4=0
//            //and only 6 will remain while will not be XORed
//            //Hence the only element here is 6 and rest of them are double;
//            //This is same as 5*3*5*2, which can be also calculated as 5*5*3*2 or other types. Position doesn't matter.
//
//        }
        System.out.println(ans);;
    }
}
