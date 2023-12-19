public class XOR_between_a_and_b_rangeOfNumbers {
    public static void main(String[] args) {
        int fromNum = 3;
        int toNum = 9;

//        System.out.println(findXOR(toNum));
//        System.out.println(findXOR(fromNum));

        int ans = findXOR(toNum) ^ findXOR(fromNum-1);
        System.out.println(ans);
    }

    public static int findXOR(int num) {
       int remainder = num % 4;
       if(remainder == 0) {
           return num;
       }
       if(remainder == 1) {
           return  1;
       }
       if(remainder == 2) {
           return num + 1;
       }
       return 0;
    }
}
