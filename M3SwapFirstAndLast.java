package JAP82.String;

public class M3SwapFirstAndLast {
    public static void main(String[] args) {
        String s1 = "Vipul";
        StringBuilder sb = new StringBuilder();

        sb.append(s1.charAt(s1.length()-1));
        sb.append(s1.substring(1, s1.length()-1));
        sb.append(s1.charAt(0));
        System.out.println(sb);
    }
}
