//13. Count Occurrences of Each Character
package murthyit.strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrences13 {
    public static void main(String[]args){
        String str="Programming";
      Map<Character,Integer> map=new HashMap<>();
      for(char ch:str.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
    }
      for(Map.Entry<Character,Integer>  entry:map.entrySet()){
          System.out.println(entry.getKey()+"----"+entry.getValue());
      }
    }
}
