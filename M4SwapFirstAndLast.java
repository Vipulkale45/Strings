package JAP82.String;

public class M4SwapFirstAndLast {
    public static void main(String[] args) {
        String s1 = "KAle";
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(0, s1.charAt(s1.length()-1));
        sb.append(s1.charAt(0));
        sb.deleteCharAt(1);
        sb.deleteCharAt(sb.length()-2);
        System.out.println(sb);
    }
}
