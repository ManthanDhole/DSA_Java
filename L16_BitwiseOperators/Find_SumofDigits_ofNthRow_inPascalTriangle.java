//Pascal Triangle :  2^n
//1st 1 => 1
//2nd 1 1 => 2
//3rd 1 2 1 => 4
//4th 1 3 3 1 => 8
//5th 1 4 6 4 1 => 16
//6th 1 5 10 10 5 1 => 32
//7th 1 6 15 20 15 6 1 => 64

public class Find_SumofDigits_ofNthRow_inPascalTriangle {
    public static void main(String[] args) {
        int nthSumofPascalTriangle = 3;

        int ans = 1 << (nthSumofPascalTriangle - 1);
        System.out.println(ans);
    }
}
