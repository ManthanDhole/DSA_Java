public class Skip_a_character {
    public static void main(String[] args) {
//        String str = "baccad";
        String str = "baccappeled";
        String ans = "";
//        skip_a_Character(str, ans);
//        skip_a_String(str, ans);
//        ans = skip_a_CharacterString(str, ans);
        skip_app_whenNotApple(str, ans);
        System.out.println(ans);
    }

    public static void skip_a_Character(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a')
        {
            skip_a_Character(str.substring(1), ans);
        }
        else
        {
            ans += ch;
            skip_a_Character(str.substring(1), ans);
        }
    }

    public static String skip_a_CharacterString(String str, String ans)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a')
        {
            ans = skip_a_CharacterString(str.substring(1), ans);
        }
        else
        {
            ans = ch + skip_a_CharacterString(str.substring(1), ans);
        }
        return ans;
    }

    public static void skip_a_String(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple"))
        {
            skip_a_String(str.substring(5), ans);
        }
        else
        {
            ans += ch;
            skip_a_String(str.substring(1), ans);
        }
    }

    public static void skip_app_whenNotApple(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple"))
        {
            skip_app_whenNotApple(str.substring(3), ans);
        }
        else
        {
            ans += ch;
            skip_app_whenNotApple(str.substring(1), ans);
        }
    }

}
