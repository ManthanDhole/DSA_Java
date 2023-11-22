public class Check_if_string_is_Palindrome {
    public static void main(String[] args) {
        //Palindrome: a string which when read from start or from end contains the same sequence of character
        //Example:  abcba, leel, teet, baab, etc
//        String str = "abccba";
        String str = "abcdecba";
        boolean isPalindrome = false;
        for (int i = 0, j = str.length()-1; i<str.length() && j >= 0; i++,j-- )
        {
            if(str.charAt(i) != str.charAt(j))
            {
                isPalindrome = false;
                break;
            }
            else
            {
                isPalindrome = true;
            }
        }

        System.out.println("String " + str + " is palindrome: " + isPalindrome);
    }
}
