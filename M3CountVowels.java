package JAP82.String;

public class M3CountVowels {
    public static void main(String[] args) {
        String s1 = "International";
        String s2= s1.toUpperCase();
        System.out.println(s2);
        int count=0;
        for(int i=0; i<s1.length(); i++)
        {
            char c=s2.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                count++;
        }
        System.out.println(count);
    }
}
