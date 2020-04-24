package LeetCode.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_anagrams {
    public static void main(String[] args) {
        String s[]={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>list=anagram(s);
        System.out.println(list);
    }

    private static List<List<String>> anagram(String[] s) {
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>>list1=new ArrayList<>();
        for (int i = 0; i <s.length ; i++) {
            String word=s[i];
            char []letter=word.toCharArray();
            Arrays.sort(letter);
            String newWord=new String(letter);

            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            }else{
                List<String>list=new ArrayList<>();
                list.add(word);
                map.put(newWord,list);
            }
        }
        for(String str:map.keySet()){
            List<String>add=map.get(str);
            list1.add(add);
        }
        return list1;
    }
}
