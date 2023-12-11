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
        return (num & 1) == 1;

    }
}
