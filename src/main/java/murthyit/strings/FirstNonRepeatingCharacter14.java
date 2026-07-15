//14. Find the First Non-Repeating Character
package murthyit.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter14 {

    public static void main(String[] args){
        String str = "aabbcddeff";
        //---1-------------Normal Approach
       Map<Character,Integer> map=new HashMap<>();
       for(char ch:str.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()==1){
               System.out.println(entry.getKey());
               break;
           }

       }
        //---2-------------Java8
      Optional<Character> result= str.chars().mapToObj(ch->(char)ch)
              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
              .entrySet().stream()
              .filter(entry->entry.getValue()==1)
              .map(entry->entry.getKey()).findFirst();
  System.out.println(result.orElse(null));
    }
}
