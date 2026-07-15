//11. Find Duplicate Characters in a String
package murthyit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters11 {
    public static void main (String[] args){
        String str= "Programming";
        //----------1-------HashMap
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("Duplicate Characters:");
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"---------"+entry.getValue());
            }
        }
        //----------2-------Java8
        str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                              .entrySet().stream()
                                              .filter(entry->entry.getValue()>1)
                                              .forEach(entry->System.out.println(entry.getKey()+"------"+entry.getValue()));



    }
}
