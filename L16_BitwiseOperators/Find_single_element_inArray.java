public class Find_single_element_inArray {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,3,1,6,2,4};
//        int[] arr = {-4,-1,-3,-2,3,1,6,2,4};
//        XORArrayTOFindSingleElement(arr);

        int[] array3TimesRepetition = {1,2,3,1,3,2,5,3,2,1,1,2,3};
//        int[] array3TimesRepetition = {2,2,3,2,7,7,8,7,8,8};
        findSingleElementInArrayOf_MultipleElements(array3TimesRepetition, 4);

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

    public static void findSingleElementInArrayOf_MultipleElements(int[] arr, int repetitionOfDigits)
    {
        int finalBitSet = 0;
        for(int i = 0; i<8; i++)
        {
            int count = 0;
            for(int num: arr) {
                int setBit = num & (1 << i);
                if (setBit != 0) {
                    count++;
                }
            }
            System.out.println(count);
            finalBitSet = finalBitSet + ((int)Math.pow(10,i) * count);
        }
        System.out.println("Final Bitset: " + finalBitSet);

        int remainderBinary = findRemainder(finalBitSet, repetitionOfDigits);
        System.out.println("Remainder Binary: " + remainderBinary);

        int finalNumber = 0;
        int count = 0;
        while(remainderBinary > 0)
        {
            int digit = remainderBinary % 10;
            if(digit != 0)
            {
                finalNumber = finalNumber + (1 << count);
            }
            count++;
            remainderBinary = remainderBinary/10;
        }
        System.out.println("Final Number: " + finalNumber);

    }
    public static int findRemainder(int num, int repetitionOfDigits)
    {
        int remainderNumber = 0;
        int count = 0;
        while(num > 0)
        {
            int digit = num % 10;
            remainderNumber = remainderNumber + ((int)Math.pow(10, count) * (digit % repetitionOfDigits));
            count++;
            num = num/10;
        }
        return remainderNumber;
    }
}
