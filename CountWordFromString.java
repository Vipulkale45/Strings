package JAP82.String;

public class CountWordFromString {
    public static void main(String[] args) {
        String s1 = "Hello i am java developer";
        int count =0;
        String s2[] = s1.split(" ");
        for(int i=0; i<s2.length; i++)
        {
            if(s2[i].length()!=0)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
//input :- Hello i am java developer
//output:- 5
