public class Find_if_noIsPowerOf2 {
    public static void main(String[] args) {
        int num = 10;

        //8: 1000 & 111 => 0000: power of 2
        //10: 1010 & 111 => 0010: not power of 2
        if ((num & (num - 1)) == 0)
        {
            System.out.println("Number is power of 2");
        }
        else
        {
            System.out.println("Not a power of 2");
        }

    }
}
