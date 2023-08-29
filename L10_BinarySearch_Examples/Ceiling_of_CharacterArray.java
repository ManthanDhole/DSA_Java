public class Ceiling_of_CharacterArray {
    public static void main(String[] args) {
        char[] ch = {'c', 'f', 'j'};
        char target = 'e';

        char[] chi = { 'e','e', 'e', 'e', 'e', 'n', 'n', 'n'};

        char ans = CeilingOf_CharArray(chi, target);
        System.out.println(ans);
    }

    static char CeilingOf_CharArray(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end]) {
            return letters[start % letters.length];
        }
        while (start <= end) {
            if (target >= letters[end]) {
                return letters[0];
            }
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if(target >= letters[mid])
                {
                    start = mid + 1;
                }
                else if(target < letters[mid])
                {
                    end = mid - 1;
                }
            }
        }
        return letters[start];
    }
}

