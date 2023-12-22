public class LeetCode_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,9},
                {1,2,2,3}
        };

        int ans = RichestPerson(arr);
        System.out.println("Person with max Wealth is: " + ans);
    }

    static int RichestPerson(int[][] arr)
    {
        int MaxWealth = 0;
        int Person_withMaxWealth = 0;

        for(int person = 0; person < arr.length; person++)
        {
            int totalWealth = 0;
            for(int accounts = 0; accounts < arr[person].length; accounts++)
            {
                totalWealth = totalWealth + arr[person][accounts];
            }
            if(totalWealth > MaxWealth)
            {
                MaxWealth = totalWealth;
                Person_withMaxWealth = person;
            }
        }
        return Person_withMaxWealth;
    }
}
