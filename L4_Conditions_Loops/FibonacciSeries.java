import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int place = sc.nextInt();

        int start = 0;
        int next = 1;
        int result = 0;

        for(int i = 0; i <= place; i++ )
        {
            result = start;
            System.out.print(result + " ");
            start = next;
            next = result + next;
        }
    }
}
