//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class Steps_to_make_number_Zero {
    public static void main(String[] args) {
        int count = 0;
        int number = 1234;
        int ans = stepsRequired(number, count);
        System.out.println("Steps required: " + ans);
    }
    public static int stepsRequired(int num, int count)
    {
        if(num == 0) return count;
        if(num % 2 == 0)
        {
            count++;
            return stepsRequired(num/2, count);
        }
        else
        {
            count++;
            return stepsRequired(num - 1, count);
        }
    }
}
