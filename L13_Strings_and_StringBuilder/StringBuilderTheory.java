import java.util.Arrays;

public class StringBuilderTheory {
    public static void main(String[] args) {
        //Normal method of making a series of alphabets: O(N^2) complexity
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch; //Here each time while adding the new character to the series
            //the previous series is copied and created newly after the append operation
            //this creates a time complexity of O(N^2) and the de-referenced value is still in the memory
            //until garbage collection is executed. This causes redundant memory allocation.
        }
        System.out.println(series);

        //Using string builder will use the original string instead of creating a copy of the string on each iteration
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            stringBuilder.append(ch);  //Appends to the existing string, doesnt create a copy of the previous string
            //O(N) complexity
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        String name = "Manthan Dhole";
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
