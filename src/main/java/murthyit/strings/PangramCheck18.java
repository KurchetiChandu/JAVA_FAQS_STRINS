// 18.Check if a String is Pangram
//A Pangram is a sentence that contains every English alphabet (a-z) at least once.
package murthyit.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PangramCheck18 {
     static void main(){
        String str = "The quick brown fox jumps over the lazy dog";
        //-----------1------------Normal Aprrocah using SET
        Set<Character> set=new HashSet<>();
        for(char ch:str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if(ch>='a' && ch<='z'){
                    set.add(ch);
                }
            }

        }
        System.out.println(set.size() == 26 ? "The string is a pangram." : "The string is not a pangram.");
        //-----------2------------java8 using SET
        boolean isPangram=str.toLowerCase().chars().filter(Character::isLetter).mapToObj(c->(char)c).collect(Collectors.toSet()).size()==26;
   System.out.println(isPangram ? "The string is a pangram." : "The string is not a pangram.");
        //-----------3------------java8 using distinct()/count()
      long count= str.chars().filter(Character::isLetter).filter(ch->ch>='a'&&ch<='z').distinct().count();
      System.out.print(count==26);
    }
}
