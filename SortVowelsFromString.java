package JAP82.String;

import java.util.Arrays;

public class SortVowelsFromString {
    public static void main(String[] args) {
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder vow = new StringBuilder();
        for(int i=0; i<s1.length(); i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                vow.append(s1.charAt(i));
            }
        }
        char c[]=vow.toString().toCharArray();
        Arrays.sort(c);
        int count=0;
        for(int i=0; i<s1.length();i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                sb.setCharAt(i, c[count++]);
            }
        }
        System.out.println(sb);
    }
}
