public class String_Theory {
    public static void main(String[] args) {
//        String name = "Manthan Dhole";
//        System.out.println(name);

        //Creates values in a String Pool
        String a = "Value";
        String b = "Value";
        //The comparison operator will compare the value as well as the reference variables.
        System.out.println("a == b: " + (a == b)); //shows that the objects are referred from the string pool and are not duplicated

        //Creates values in the heap but outside the String Pool
        String A = new String("Value");
        String B = new String("Value");
        //The comparison operator will compare the value as well as the reference variables.
        System.out.println("A == B: " + (A == B)); //shows that the objects created are different and are duplicated explicitly

        System.out.println("A == B: " + (A.equals(B))); //Use equals method to only compare the value and not the memory location of the object

        //Get the character at a specific index of the string
        System.out.println(A.charAt(0));
    }
}
