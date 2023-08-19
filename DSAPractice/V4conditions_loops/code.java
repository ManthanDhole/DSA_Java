package V4conditions_loops;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        int start = 0;
        int next = 1;
        int res = 0;
        for(int i = 0; i <= index; i++)
        {
            res = start;
            System.out.print(res + " ");
            start = next;
            next = res + next;
        }

    }
}
