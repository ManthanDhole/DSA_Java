import java.util.Scanner;

public class NumberOfOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        System.out.print("Enter which number to find: ");
        int findDigit = sc.nextInt();

        int digit = 0;
        int count = 0;

        while(number > 0)
        {
            digit = (int) number % 10;
            if(digit == findDigit)
            {
                count++;
            }
            number = number / 10;
        }
        System.out.println("The number " + findDigit + " occurs " + count + " times.");
    }
}
