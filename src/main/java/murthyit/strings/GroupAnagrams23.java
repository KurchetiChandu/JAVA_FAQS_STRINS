//23. Group Anagrams from a List of Strings
/*"ప్రతి word ని sort చేసి, sorted string ని HashMap key గా ఉపయోగిస్తాం.
ఒకే sorted key వచ్చిన అన్ని words ఒకే list లో చేరతాయి.
చివరగా HashMap values నే answer గా return చేస్తాం."*/
package murthyit.strings;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams23 {
    public static void main(String[] args){
        //1---------NormalApproach
        String[] words={"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map=new HashMap<>();
        for(String word:words){
           char[] chars=word.toCharArray();
           Arrays.sort(chars);
          String key=new String(chars);
          map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }
        List<List<String>> result=new ArrayList<> (map.values());
        System.out.println(result);
        //2---------Java8
      List<String> words1=Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Collection<List<String>> result1 = words1.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values();

        result.forEach(System.out::println);
    }
}
