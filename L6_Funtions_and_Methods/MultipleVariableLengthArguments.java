import java.util.Arrays;

public class MultipleVariableLengthArguments {
    public static void main(String[] args) {
        Multiple_Arguments_with_VariableLengthArgs(1,2, "Manthan", "Dhole");
    }
    //The Variable Length Argument must be the last one in the list or else it could recognize how many number of
    //arguments are passed if it is in the middle of the Argument List
    static void Multiple_Arguments_with_VariableLengthArgs(int a, int b, String ...names)
    {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println(Arrays.toString(names));
    }
}
