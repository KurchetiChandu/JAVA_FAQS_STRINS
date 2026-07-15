//15. Find the Most Repeated Character
package murthyit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacter15 {
    public static void main(String[] args){
        String str = "programming";
        //-----------1----------Normal Approach
       Map<Character,Integer> map=new HashMap<>();
       for(char ch:str.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       char maxChar='\0';
      int maxCount=0;
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()>maxCount){
               maxChar =entry.getKey();
               maxCount=entry.getValue();
           }
       }
       System.out.println(maxChar+"-----"+maxCount);
        //-----------2----------JAVA8
      Optional<Map.Entry<Character,Long>> result= str.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
      result.ifPresent(e->System.out.println(e.getKey()+"-------"+e.getValue()));
    }
}
