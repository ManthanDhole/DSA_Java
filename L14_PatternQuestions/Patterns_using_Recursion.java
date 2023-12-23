public class Patterns_using_Recursion {
    public static void main(String[] args) {
//        inverseRightAngledTriangle(5, 0);
        normalRightAngledTriangle(5,0);
    }
    public static void normalRightAngledTriangle(int rowCount, int columnCount)
    {
        if(rowCount == 0) return;
        if(columnCount < rowCount)
        {
            normalRightAngledTriangle(rowCount, columnCount+1);
            System.out.print("* ");
        }
        else
        {
            normalRightAngledTriangle(rowCount-1, 0);
            System.out.println();
        }
    }
    public static void inverseRightAngledTriangle(int rowCount, int columnCount)
    {
        if(rowCount == 0)
        {
            return;
        }
        if(columnCount < rowCount)
        {
            System.out.print("* ");
            inverseRightAngledTriangle(rowCount, columnCount+1);
        }
        else
        {
            System.out.println();
            inverseRightAngledTriangle(rowCount-1, 0);
        }
    }
}
