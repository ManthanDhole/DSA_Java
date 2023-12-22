public class How_many_Zeros_in_a_Number {
    public static void main(String[] args) {
        int count = 0;
        int number = 110;
        int ans = countZeros(number, count);
        System.out.println("Number of zeros: " + ans);
    }
    public static int countZeros(int num, int count)
    {
        //Special method to return value to above function calls
        if(num == 0) return count;
        int digit =  num % 10;
        if(digit == 0)
        {
            count++;
        }
        return countZeros(num/10, count);
    }
}
