public class Sum_of_digits_of_a_Number {
    public static void main(String[] args) {
        int number = 505;
//        int ans = sumOfDigits(number);
//        int ans = sumOfDigits_shorten(number);
        int ans = productOfDigits(number);
//        System.out.println("Sum of Digits in " + number + " is " + ans);
        System.out.println("Product of Digits in " + number + " is " + ans);
    }

    public static int sumOfDigits(int num)
    {
        if(num == 0) return 0;
        int digit = num % 10;
        num = num/10;
        int ans = digit + sumOfDigits(num);
        return ans;
    }
    public static int sumOfDigits_shorten(int num)
    {
        if(num == 0) return 0;
        return (num % 10) + sumOfDigits(num/10);
    }
    public static int productOfDigits(int num)
    {
        if(num%10 == num) return num;
        return (num % 10) * productOfDigits(num/10);
    }
}
