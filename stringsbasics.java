package Strings;
import java.util.*;
public class stringsbasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Vipulkale"; // Syntax
        System.out.println(str);

       // String str = "Hello";
       // System.out.println(str.length())
        char ch  = str.charAt(1);
        System.out.println(ch);
        //System.out.println(str.charAt(4));

       // System.out.println(str.indexOf('r'));

       // String gtr = "Hello";
        // System.out.println(str.compareTo(gtr));
       String vip = "Physics wallah";
      System.out.println(vip.toUpperCase());
        // System.out.println(vip.toLowerCase());
        //System.out.println(vip.contains("wal"));
        //System.out.println(vip.startsWith("Phy"));
        //System.out.println(vip.endsWith("ah"));

        String s1 = "abc";
        String s2 = "def";

        System.out.println(s1.concat(s2));

        /*
        str.charAt(index) → Returns the character at the specified index.
        str.length() → Returns the length (number of characters) of the string.
        str.indexOf(substring) → Returns the index of the first occurrence of the given substring.
        str.compareTo(str2) → Compares two strings lexicographically (returns 0 if equal, a positive or negative value otherwise).
        vip.toUpperCase() → Converts all characters to uppercase.
        vip.toLowerCase() → Converts all characters to lowercase.
        vip.contains(substring) → Checks if the string contains the given substring (returns true or false).
        vip.startsWith(prefix) → Checks if the string starts with the given prefix.
        vip.endsWith(suffix) → Checks if the string ends with the given suffix.
        s1.concat(s2) → Joins two strings and returns the concatenated result.
        s.substring(j) → Extracts a substring from index j to the end of the string.
        s1.equals(s3) -> equals s1 and s2
        */



    }
}
