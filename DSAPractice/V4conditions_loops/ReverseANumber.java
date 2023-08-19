package V4conditions_loops;

public class ReverseANumber {
    public static void main(String[] args) {
        long number = 1234567890L;
        long revNumber = 0;
        long digit = 0;
        System.out.println("Number: " + number);
        while(number > 0)
        {
            digit = number % 10;
            revNumber = (revNumber*10) + digit;
            number /= 10;
        }
        System.out.println("Reverse: " + revNumber);
    }
}
