//7. Remove Spaces from String
package murthyit.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveSpaces7 {
    public static void main(String[] args){
        String str = "Java Backend Developer";
        //--------1-----replace()
       String str1=str.replace(" ","");
        //--------2-----replaceAll()
      String str2= str.replaceAll("\\s+","");
        System.out.println(str2);
        //--------3-----StringBulder
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
             if(ch !=' '){
                 sb.append(sb);
             }
        }
        System.out.println(sb);
        //--------4-----Java8
      String  result=str.chars().filter(ch->ch !=' ').mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
      System.out.println(result);
        //--------5-----Java8---StringJoiner
       String str3=Arrays.stream(str.split(" ")).reduce("",String::concat);
        System.out.println("Split--------"+str3);
        //--------6-----Java8---RemoveWhiteSpaces
        String str4 = "Java   Backend\tDeveloper\nJava";
       String result2= str4.chars().filter(ch-> !Character.isWhitespace(ch)).mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
         System.out.println(result2);
    }
}
