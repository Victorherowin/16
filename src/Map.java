import java.util.*;
public class Map {
    public boolean IsAnagram(String s,String t)
    {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return String.valueOf(a).equals(String.valueOf(b));
    }
    public static void main(String[] args)
    {
        String s="abcdefg";
        String x="cdabefg";
        Map m=new Map();
        System.out.println(m.IsAnagram(s,x));

    }

}
