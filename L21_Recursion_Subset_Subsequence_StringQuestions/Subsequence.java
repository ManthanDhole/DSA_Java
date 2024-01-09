//Use subsequence in solving permutations, combinations and subset questions
//Theory of Subsequence involves:
//If there is an input: abc
//with each individual character you have 2 choices
//Either you take it or dont. Hence 1st recursion call will take the character/element and other recursion call will
//not take the character/element

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
//        subsequence(str, ans);
//        subsequence_kunal(str, ans);

        ArrayList<String> answer = subsequence_kunal_arrayList(str, ans);
        System.out.println(answer.toString());
    }

    public static void subsequence(String processedStr, String unprocessedStr)
    {
        if(processedStr.isEmpty())
        {
            return;
        }
        char ch = processedStr.charAt(0);

        //First call will accept the sub character of the string
        String accept = unprocessedStr+ch;
        subsequence(processedStr.substring(1), accept);
        //Second call will reject the sub character of the string
        String reject = unprocessedStr;
        subsequence(processedStr.substring(1), reject);
        //Finally only print if the string is accepted
        System.out.print(accept + " ");
    }

    public static void subsequence_kunal(String processedStr, String unprocessedStr)
    {
        if(processedStr.isEmpty())
        {
            System.out.print(unprocessedStr + " ");
            return;
        }
        char ch = processedStr.charAt(0);
        subsequence_kunal(processedStr.substring(1), unprocessedStr + ch);
        subsequence_kunal(processedStr.substring(1), unprocessedStr);
    }

    public static ArrayList<String> subsequence_kunal_arrayList(String processedStr, String unprocessedStr)
    {
        if(processedStr.isEmpty())
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(unprocessedStr);
            return list;
        }
        char ch = processedStr.charAt(0);
        ArrayList<String> left = subsequence_kunal_arrayList(processedStr.substring(1), unprocessedStr + ch);
        ArrayList<String> right =subsequence_kunal_arrayList(processedStr.substring(1), unprocessedStr);

        left.addAll(right);
        return left;
    }
}
