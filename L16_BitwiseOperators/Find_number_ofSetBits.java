public class Find_number_ofSetBits {
    public static void main(String[] args) {
        int num = 45;
        int count = 0;
        System.out.println(Integer.toBinaryString(num));
        //Method 1: Right shift by one until the number is greater than zero
//        while(num > 0)
//        {
//            if((num & 1) == 1)
//            {
//                count++;
//            }
//            num = num >> 1;
//        }
//        System.out.println(count);

        //Method 2: & the number with n-1 until num is greater than zero
        //9: 1001
        //1001 (8) & 1000 (8) => 1000
        //1000 (8) & 111 (7) => 0000
        while(num > 0)
        {
            num = num & (num-1);
            count++;
        }
        System.out.println(count);

    }
}
