//LeetCode Question
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class Calculate_Numbers_ofEvenDigits {
    public static void main(String[] args) {
        int[] arr = {23,542,1432,-734566,42523};
        int ans = calculateEvenNumberOfDigits(arr);
        System.out.println("Total elements having digit count as an Even Number is (Method 1): " + ans);
        int ans2 = checkIfNumber_isOf_EvenDigits(arr);
        System.out.println("Total elements having digit count as an Even Number is (Method 2): " + ans2);

    }
    static int calculateEvenNumberOfDigits(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int totalEvenElements = 0;
        int number;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            number = arr[i];
            while(number > 0)
            {
                count++;
                number = number/10;
            }
            if(count%2 == 0)
            {
                totalEvenElements++;
            }
        }
        return totalEvenElements;
    }

    //Optimized code using Math library
    static int checkIfNumber_isOf_EvenDigits(int[] arr)
    {
        int count = 0;
        for(int i: arr)
        {
            //To convert negative number into a positive
            if(i < 0)
            {
                i = i * -1;
            }
            if( ((int) (Math.log10(i)+1)) % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

}
