package Strings;
import java.util.*;


public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" word");
        System.out.println(str);
        str.setCharAt(0, 'm');
        System.out.println(str);
        str.insert(2 , 'i');
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        str.reverse();

        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(2 ,4);
        System.out.println(sb);

        System.out.println(sb.substring(3));

    }
}
