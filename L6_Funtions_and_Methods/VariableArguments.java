import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        VariableLength_of_int_Arguments(1,2,3,4,5,6,7,8,9,10);  //integer
        VariableLength_of_string_Arguments("Manthan", "Dhole", "Microsoft");  //strings
    }
    //Variable Length of Arguments means that any number of arguments can be passed to the function where it is mentioned
    //as (dataType ...varName) which denotes that an Array of that data type is supposed to be passed which could be of
    //any length ex: 0 to Whatever you want.
    static  void VariableLength_of_int_Arguments(int ...nums)
    {
        System.out.println(Arrays.toString(nums));
    }

    static  void VariableLength_of_string_Arguments(String ...names)
    {
        System.out.println(Arrays.toString(names));
    }
}
