//9.Check if Two Strings are Anagrams
/*Two strings are called Anagrams if they contain the same characters with the same frequency,
 but the order can be different.*/
/*"First, I'll check whether both strings have the same length.
If lengths differ, they can't be anagrams.
 Then I'll compare the frequency of every character.
 There are multiple approaches such as sorting,
 using a frequency array, HashMap, and Java 8 Streams.
 For lowercase English letters, the frequency-array approach is the most efficient."*/
package murthyit.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheck9 {
    public static void main(String[] args){
        System.out.println(isAnagramJava8("listen", "silent"));
    }
    //------1-------Arrays.sort()
    public static boolean isAnagram(String str1,String str2){
        if(str1==null||str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
       char[] ch1=str1.toCharArray();
       char[] ch2=str2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       return Arrays.equals(ch1,ch2);
    }
    //------2-------HashMap
    public static boolean isAngaramHashMap(String str1,String str2){
        if(str1==null || str2==null){
              return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> map= new HashMap<>();
        for(char ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str2.toCharArray()){
          if(!map.containsKey(ch))
              return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
    //------3-------Java8
    public static boolean isAnagramJava8(String str1,String str2){
        if(str1==null || str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
      Map<Character,Long>  map1=str1.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      Map<Character,Long>  map2=str2.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return map1.equals(map2);
    }
}
