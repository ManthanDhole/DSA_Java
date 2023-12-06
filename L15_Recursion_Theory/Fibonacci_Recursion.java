//This program wont work for higher values because of the huge Recursive Tree
public class Fibonacci_Recursion {
    public static void main(String[] args) {
        int number = 10;
        int answer = FibonacciNumber(number);
        System.out.println("The " + number + "th fibonacci number is " + answer);
    }
    public static int FibonacciNumber(int num)
    {
        if(num < 2)
        {
            return num;
        }
        return FibonacciNumber(num-1) + FibonacciNumber(num-2);
    }
}
