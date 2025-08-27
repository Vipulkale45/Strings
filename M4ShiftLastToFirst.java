package JAP82.String;

public class M4ShiftLastToFirst {
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(0, sb.charAt(s1.length()-1));
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
