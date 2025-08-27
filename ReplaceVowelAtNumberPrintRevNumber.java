package JAP82.String;
//input = International
//ouput = 6nt5rn4t32n1l
public class ReplaceVowelAtNumberPrintRevNumber {
    public static void main(String[] args) {
        String s1 = "International";
        String s2 = "AEIOUaeiou";
        int count=0;
        StringBuilder sb= new StringBuilder(s1);
        for(int i=sb.length()-1; i>=0; i--)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                sb.deleteCharAt(i);
                sb.insert(i, ++count);
            }
        }
        System.out.println(sb);
    }
}
