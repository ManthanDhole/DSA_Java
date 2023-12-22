import jdk.jshell.execution.JdiDefaultExecutionControl;

//One method you can use is by check if the reverse of the number is same or not.
//Example is in Reverse_a_Number program
public class Palindrome {
    public static void main(String[] args) {
        int number = 1221;
        boolean ans = palindrome(number);
        System.out.println("Is Palindrome?: " + ans);
    }
    public static boolean palindrome(int num)
    {
        if(num == 0) return true;
        int digits = (int) Math.log10(num) + 1;
        int first = getFirstNumber(num, digits);
        int last = getLastNumber(num);
        if(first == last)
        {
            num = num % (int) Math.pow(10, digits-1);
            num = num/10;
            return palindrome(num);
        }
        else
        {
            return false;
        }
    }
    public static int getFirstNumber(int num, int digits)
    {
        if(num/10 == 0) return num;
        int firstNumber = num / (int) Math.pow(10, digits-1);
        return firstNumber;
    }
    public static int getLastNumber(int num)
    {
        if(num/10 == 0) return num;
        int lastNumber = num % 10;
        return lastNumber;
    }
}
