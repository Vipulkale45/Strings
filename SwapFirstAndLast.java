package JAP82.String;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        String s1 = "India";
        String s2 ="";
        s2+=s1.charAt(s1.length()-1);
        for(int i=1;i<s1.length()-1; i++)
        {
            s2+=s1.charAt(i);
        }
        s2+=s1.charAt(0);
        System.out.println(s2);

    }
}
