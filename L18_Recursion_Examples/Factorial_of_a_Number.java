public class Factorial_of_a_Number {
    public static void main(String[] args) {
        int ans = factorial(15);
        System.out.println("Factorial: " + ans);
    }

    public static int factorial(int num)
    {
        if(num == 0) return 1;
        int ans = num * factorial(num-1);
        return ans;
    }
}
