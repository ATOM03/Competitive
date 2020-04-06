package Strings;

//import java.util.HashMap;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        compression(s);
//        compression1(s);
    }

    private static void compression1(String s) {
        StringBuilder output=new StringBuilder();
        char last=s.charAt(0);
        int count=1;

        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)==last)
                count++;
            else{
                if (count > 1) {
                    output.append(last+count+"");
                }else{
                    output.append(last+count+"");
                }
                count=1;
                last=s.charAt(i);
            }
        }
        System.out.println(output.toString());
    }

    private static void compression(String s) {
        HashMap<String,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            String ch=s.charAt(i)+"";
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
//        System.out.println(map);
        Set<String> sets=map.keySet();
//        System.out.println(sets);
        for (String set:sets) {
            System.out.print(set+map.get(set));
        }
        System.out.println();
    }
}
