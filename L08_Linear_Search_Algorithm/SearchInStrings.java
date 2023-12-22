public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Manthan";
        char ch = 'z';

        boolean isCharPresent = SearchCharacter_inString(str, ch);
        System.out.println(isCharPresent);

    }

    static boolean SearchCharacter_inString(String str, char charToSearch)
    {
        if(str.isEmpty())
        {
            return false;
        }
        for(int i = 0; i < str.length(); i++)
        {
            if(charToSearch == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
