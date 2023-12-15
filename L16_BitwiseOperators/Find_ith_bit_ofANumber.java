public class Find_ith_bit_ofANumber {
    public static void main(String[] args) {
        int num = 32;
        int bitNumber = 3;
//        ithBitOfNumber(num, bitNumber);
//        setIthBitToOne(num, bitNumber);
//        resetIthBitToZero(num, bitNumber);
        findRightMostSetBit(num);
    }

    public static void ithBitOfNumber(int num, int bitNum)
    {

        int ans = num & (1 << bitNum-1);
        if(ans!=0)
        {
            System.out.println("Bit at position: " +  bitNum + " is " + 1);
        }
        else
        {
            System.out.println("Bit at position: " +  bitNum + " is " + ans);
        }
    }
    public static void setIthBitToOne(int num, int bitNum)
    {
        int ans;
        ans = num | (1 << (bitNum-1));
        System.out.println("Set Bit Ans: " + ans);
    }

    public static void resetIthBitToZero(int num, int bitNum)
    {
        System.out.println((1 << (bitNum-1)));
        int ans = num | ~(1 << (bitNum-1));
        System.out.println("Reset bit Ans: " + ans);
    }

    //Right most set bit: Which is the position in the binary representation of a number which is 1
    //Number: BinaryRepresentation => Position of RightMost Set (1) Bit
    //1: 000001 => 1
    //2: 000010 => 2
    //3: 000011 => 2
    //4: 000100 => 3
    //5: 000101 => 1
    //6: 000110 => 2
    //8: 001000 => 4
    public  static  void findRightMostSetBit(int num)
    {
        boolean status = true;
        int bitPosition = 0;
        int ans;
        while(status)
        {
            ans = num & (1 << (bitPosition));
            if(ans != 0)
            {
                status = false;
            }
            bitPosition++;
        }
        System.out.println("Rightmost Set Bit: " + bitPosition);
    }
}
