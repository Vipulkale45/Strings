package JAP82.String;

public class ShiftAllVowelsAtLast {
    public static void main(String[] args) {
        String s1 = "international";
        String s2 = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<s1.length(); i++)
        {
            if(!s2.contains(String.valueOf(s1.charAt(i))))
            {
                sb.append(s1.charAt(i));
            }
            else
            {
                sb1.append(s1.charAt(i));
            }
        }
        sb.append(sb1);
        System.out.println(sb);
    }
}
