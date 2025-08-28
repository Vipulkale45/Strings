package JAP82.String;

public class ReverseEachWordsFromString {
    public static void main(String[] args) {
        String s1 = "Hello i am java developer";
        String s2[] = s1.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s2.length; i++)
        {
            sb.append(new StringBuilder(s2[i]).reverse());
            if(i<s2.length-1)
            {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
//input: Hello i am java developer
//output: olleH i ma avaj repoleved
