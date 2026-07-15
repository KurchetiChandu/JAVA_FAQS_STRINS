//12.Remove Duplicate Characters
package murthyit.strings;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters12 {
    public static void main(String[] args){
        String str = "programming";
//1===========Normal Approach with Collection
        Set<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
             set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for( char ch:set){
            sb.append(ch);
        }
        System.out.println(sb);
        //2=====================Normal Approach with Collection
        StringBuilder sb1=new StringBuilder();
        for(char ch:str.toCharArray()){
             if(sb1.indexOf(String.valueOf(ch))==-1){
                  sb1.append(ch);
             }
        }
        System.out.println(sb1);
        //3=====================Java8
       String result=str.chars().mapToObj(ch->String.valueOf((char)ch)).distinct().collect(Collectors.joining());
       System.out.println(result);
    }

}
