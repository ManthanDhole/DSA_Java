package V4conditions_loops;

import java.math.BigInteger;
import java.util.Scanner;

public class OccurancesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        int count = 0;
        while(number>0)
        {
            if (number % 10 == digit)
            {
                count++;
            }
            number /= 10;
        }
        System.out.println("The number occurs " + count + " times");
    }
}
