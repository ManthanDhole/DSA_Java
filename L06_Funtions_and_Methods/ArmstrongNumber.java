public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(isArmstrongNumber(371));

        for(int i = 0; i<=100000; i++)
        {
            if(isArmstrongNumber(i))
            {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isArmstrongNumber(long number)
    {
        int length = (int) (Math.log10(number) + 1); //To count how many digits are present in a given number
        long originalNum = number;
        long sum = 0;
        long digit = 0;
        while(number > 0)
        {
            digit = number%10;
            sum = sum + (long) Math.pow(digit, length);
            number = number/10;
        }
        return sum == originalNum;
    }
}
