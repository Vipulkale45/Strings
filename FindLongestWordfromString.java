package JAP82.String;
//input:- Hello i am java developer
//output:- developer
public class FindLongestWordfromString {
    public static void main(String[] args) {
        String s1 = "Hello i am java developer";
        String s2[]=s1.split(" ");
        String s3 = s2[0];
        for(int i=0; i<s2.length; i++)
        {
            if(s2[i].length()>s3.length())
            {
                s3=s2[i];
            }
        }
        System.out.println(s3);
    }
}
