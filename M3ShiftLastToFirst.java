package JAP82.String;

public class M3ShiftLastToFirst {
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuilder sb = new StringBuilder();

        sb.append(s1.charAt(s1.length()-1));
        sb.append(s1.substring(0, s1.length()-1));
        System.out.println(sb);
    }
}
