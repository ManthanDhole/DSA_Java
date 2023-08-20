import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it: ");
        long number = sc.nextLong();

        int digit = 0;
        long reversed = 0;
        while(number > 0)
        {
            digit = (int) number % 10;
            reversed = (reversed*10) + digit;
            number = number/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
