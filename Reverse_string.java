package Strings;

public class Reverse_string {
    public static void main(String[] args) {
        reverseString("vipul");
    }

    public static void printAllStrings(String input)
    {
       int n = input.length();
       for(int startIndex =0; startIndex<n; startIndex++)
       {
           for(int endindex = startIndex+1; endindex<=n;endindex++)
               System.out.println(input.substring(startIndex, endindex));
       }
    }

    public static void reverseString(String input){
        // 1st method
        String ans = "";
        for(int i=0;i<input.length();i++){
            ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }
}
