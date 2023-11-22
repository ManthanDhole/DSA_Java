import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        System.out.println(a);
        System.out.printf("Precision upto 2 decimals: %.2f\n", a);

        //To output some digits of precision after the decimal use the %d.Nf where N is the digits of required precision
        System.out.println(Math.PI);  //3.141592653589793
        System.out.printf("PI: %.3f\n", Math.PI);  //3.142

        //Using + with 'characters' will add the ASCII value of the characters
        System.out.println('a' + 'b');
        //Using + with "String" will concatenate them
        System.out.println("a" + "b");

        //ASCII value of the character will be used here for addition
        System.out.println('a' + 3);
        //Type casting the output can give us the character from the ASCII
        System.out.println((char)('a' + 3));

        //Using + operator with string and number will concatenate the string with the number
        System.out.println("a" + 3);

        //Using complex data types
        System.out.println("Manthan" + new ArrayList<>()); //Manthan[] -> Empty Array

        //In Java + operator can be used only with the primitive types or Object types if one of the member in expression is a String
        //System.out.println(new Integer(5) + new ArrayList<>());
        System.out.println(new Integer(5) + "" + new ArrayList<>());
    }
}
