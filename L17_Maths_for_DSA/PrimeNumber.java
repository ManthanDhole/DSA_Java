public class PrimeNumber {
    public static void main(String[] args) {
//        int num = 36;
        int num = 11;
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        int comparator = 2;
        //Square root the number
        int root = (int) Math.sqrt(num);
        //Or else comparator*comparator <= num => instead of sqrt, take the square on both sides
        while(comparator <= root)
        {
            if(num % comparator == 0)
            {
                return false;
            }
            comparator++;
        }
        return true;
    }
}
