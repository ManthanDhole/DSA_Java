public class Pattern_Threory {
    public static void main(String[] args) {
        //Step 1: Check how many rows and columns are there. Outer Loop for rows and Inner loop for columns
        //Step 2: Identify for every row how many columns are there or type of elements in the column

//        starPatternSimple(5);
//        starPatternAscendingTriangle(5);
//        starPatternDescendingTriangle(5);
//        numberPatternAscendingTriangle(5);
//        starPatternAscDescTriangle(5);
//        rightAngledTrianglewithSpaces(5);
//        invertedRightAngledTrianglewithSpaces(5);
//        equilateralTriangle(5);
        invertedEquilateralTriangle(5);

    }

    public static void starPatternSimple(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns <= counts; columns++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starPatternAscendingTriangle(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns <= rows; columns++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starPatternDescendingTriangle(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 5; columns >= rows; columns--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberPatternAscendingTriangle(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns <= rows; columns++)
            {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }

    public static void starPatternAscDescTriangle(int counts)
    {
        for(int rows = 1; rows < 2 * counts; rows++)
        {
            int columnElements = rows;
            if(columnElements > counts)
            {
                columnElements = counts - (rows - counts);
            }
            for(int columns = 1; columns <= columnElements; columns++)
            {
//                System.out.print(columns + " ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngledTrianglewithSpaces(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns <= counts; columns++)
            {
                if(columns <= counts-rows)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRightAngledTrianglewithSpaces(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            int colCounts = counts - rows;
            for(int columns = counts; columns >= 0; columns--)
            {
                if(columns <= colCounts)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void equilateralTriangle(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns < (2*counts); columns++)
            {
                if(columns < counts - (rows - 1))
                {
                    System.out.print(" ");
                }
                else if(columns > (counts + (rows - 1)))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void invertedEquilateralTriangle(int counts)
    {
        for(int rows = 1; rows <= counts; rows++)
        {
            for(int columns = 1; columns < (2*counts); columns++)
            {
                if (!(columns > rows-1))
                {
                    System.out.print(" ");
                }
                else if(columns <= (2*counts - rows))
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void equilateralTriangleWithSpaces(int counts)
    {
        for(int rows = 1; rows < counts; rows++)
        {
            for(int columns = 1; columns < (2*counts); columns++)
            {

            }
        }
    }
}
