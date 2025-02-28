package Strings;

import java.util.*;

public class builder_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0; i<=str.length()-1; i++)
        {
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;

            if(asci>=97) flag = false;
            if(flag==true)
            {
                asci+=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
            else {
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}

/*
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                str.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                str.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        System.out.println(str);
    }
}

 */