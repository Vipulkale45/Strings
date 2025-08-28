package JAP82.String;

public class PallindromeWordsFromString {
    public static void main(String[] args) {
        String s1 = "Hello nayan where is nitin and aman";
        String s2[] = s1.split(" ");
        for(int i=0; i<s2.length; i++)
        {
            if(s2[i].equalsIgnoreCase(new StringBuilder(s2[i]).reverse().toString()))
            {
                System.out.println(s2[i]);
            }
        }
    }
}
//input: Hello nayan where is nitin and aman
//output: nayan , nitin