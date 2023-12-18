public class Find_nth_magic_number {
    public static void main(String[] args) {
        int num = 7;
//        int num = 6;
        nthMagicNumber(num);
    }

    //num = 3 => 00000011
    //base = 5;
    //lastBinaryDigit = num & 1 => 11 = 1 & 1 => 1
    //0 += 1 * 5(base); => 5
    //base = base * 5 => 25
    //right shift the number: 11 >> 1 => 1
    //5 += 1 * 25; => 30
    //right shift the number: 1 >> 1 => 0
    //break

    public static void nthMagicNumber(int num)
    {
        int ans = 0;
        int base = 5;
        while(num > 0)
        {
            int lastBinaryDigit = num & 1;
            num = num >> 1;
            ans += lastBinaryDigit*base;
            base = base * 5;
        }
        System.out.println("The Magic value: " + ans);
    }
}
