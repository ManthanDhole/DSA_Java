public class EvenOddNumber_usingBitwiseOperator {
    public static void main(String[] args) {
//        int num = 8;
        int num = 5;
        System.out.println(isOdd(num));

    }
    public static boolean isOdd(int num)
    {
        //Last significant bit will be the value returned.
        //if 1 is the LSB then the number is odd: 1011 => odd
        //if 0 is the LSB then the number is even: 1010 => even

        //1001011 & 1 => 1001011 & 0000001 => gives 0000001
        //as all the 0's and 1's will get 0 by the preceding 0's in 0000001
        //hence remainder will be 1 for all the odd numbers
        return (num & 1) == 1;

    }
}
