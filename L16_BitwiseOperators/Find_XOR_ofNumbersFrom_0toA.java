public class Find_XOR_ofNumbersFrom_0toA {
    public static void main(String[] args) {
        int num = 16;
        int startNum = 0;
        while(startNum <= num)
        {
            int remainder = startNum % 4;
            switch (remainder)
            {
                case 0:
                    System.out.println(startNum);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(startNum + 1);
                    break;
                case 3:
                    System.out.println(0);

            }
            startNum++;
        }
    }
}
