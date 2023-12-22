public class Reverse_a_Number {
    public static void main(String[] args) {
//        int number = 1234321;
        int number = 1;
        int digits = (int) Math.log10(number) + 1;
        int ans = reverse(number, digits);
        System.out.println(ans);

        boolean palindromicNumber = palindrome(number, digits);
        System.out.println("Palindrome?: " + palindromicNumber);
    }
    public static int reverse(int num, int count)
    {
        if(num == 0) return 0;
        int ans = ((num % 10) * (int)Math.pow(10, count-1)) + reverse(num/10, --count);
        return ans;
    }
    public static boolean palindrome(int num, int count)
    {
        return num == reverse(num, count);
    }
}
