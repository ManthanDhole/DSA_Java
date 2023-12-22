public class FuntionOverloading {
    public static void main(String[] args) {
        function(1);
        function("Manthan");
    }

    //Two or more Functions of the same name and return type can exist if the parameters are different

    static void function(int a)
    {
        System.out.println(a);
    }

    static void function(String str)
    {
        System.out.println(str);
    }
}
