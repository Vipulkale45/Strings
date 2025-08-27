package JAP82.String;
//input:- International
//output:- 1nt2rn3t45n6l
public class ReplaceVowelAtNumber {
    public static void main(String[] args) {
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0; i<s1.length(); i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                sb.append(++count);
            }
            else
            {
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
    }
}


