package JAP82.String;

public class M2ShiftCharToLastFromString {
    public static void main(String[] args) {
        String s1 = "Vipul";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s1.length(); i++)
        {
            sb.append(s1.charAt(i));
        }
        
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }
}
