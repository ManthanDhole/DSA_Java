//To get the ASCII value of a character just add it with zero: ch + 0
//This will return the int value as char + int will return integer.
public class Subsequence_with_ASCII_value {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subsequenceASCII(str, ans);
    }
    public static void subsequenceASCII(String processedStr, String unprocessedStr)
    {
        if(processedStr.isEmpty())
        {
            System.out.println(unprocessedStr);
            return;
        }
        char ch = processedStr.charAt(0);
        String accept = unprocessedStr+ch;
        String ascii = unprocessedStr + (ch + 0);
        subsequenceASCII(processedStr.substring(1), accept);
        subsequenceASCII(processedStr.substring(1), ascii );

        String reject = unprocessedStr;
        subsequenceASCII(processedStr.substring(1), reject);

    }
}
