//10.Capitalize First Letter of Each Word
package murthyit.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWords10 {
    public static void main(String[] args){
        String input = "java backend developer";
        System.out.println(capitalizeWordsJava8(input));
    }
    //----------1-------StringBuilder
   public static  String capitalizeWords(String str){
        if(str==null||str.trim().isEmpty()){
            return str;
        }
        StringBuilder sb=new StringBuilder();

        for(String word:str.split("\\s+")){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
    //----------2-------Java8
   public static String capitalizeWordsJava8(String str){
        if(str==null||str.trim().isEmpty()){
            return str;
        }
      String result =Arrays.stream(str.trim().split("\\s+")).map(word->Character.toUpperCase(word.charAt(0))+
                                              word.substring(1).toLowerCase())
                                          .collect(Collectors.joining(" "));
      /*---------By using Substring
      String result1 =Arrays.stream(str.trim().split("\\s+")).map(word->word.substring(0,1).toUpperCase()+
                       word.substring(1).toLowerCase())
               .collect(Collectors.joining(" "));*/

        return result;
    }

}
