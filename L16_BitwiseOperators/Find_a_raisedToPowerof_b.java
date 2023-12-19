public class Find_a_raisedToPowerof_b {
    public static void main(String[] args) {
        //Find 3^6
        int base = 3;
        int power =  6;
        int ans = 1;
        while(power>0)
        {
            int digit = power & 1;
            if(digit == 1)
            {
                ans = ans * base;
            }
            power = power >> 1;
            base = base * base;
        }

        System.out.println(ans);

    }
}
