public class Print_1to5_and_5to1 {
    public static void main(String[] args) {
//        print5to1(5);
//        print1to5(5);
        print5to1_and_1to5(5);
    }


    public static void print5to1(int num)
    {
        if(num == 0) return;
        System.out.print(num + " ");
        print5to1(num - 1);
    }

    public static void print1to5(int num)
    {
        if(num == 0) return;
        print1to5(num - 1);
        System.out.print(num + " ");
    }
    public static void print5to1_and_1to5(int num)
    {
        if(num == 0) return;
        System.out.print(num + " ");
        print5to1_and_1to5(num - 1);
        System.out.print(num + " ");
    }
}
