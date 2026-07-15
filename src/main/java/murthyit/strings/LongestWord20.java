//20. Find Longest Word in a Sentence
package murthyit.strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord20 {
    public static void main(String[] args){
        String sentence = "Java backend developer interview preparation";
        //1-----------Normal Approach
       long maxLength=0;
       String  maxWord="";
       for(String word:sentence.toLowerCase().split(" ")){
           if(word.length()>maxLength){
               maxLength=word.length();
               maxWord=word;
           }
       }
       System.out.println(maxWord+"-------------"+maxLength);
        //2-----------JAVA8
      String  longest=Arrays.stream(sentence.toLowerCase().split("\\s+")).max(Comparator.comparing(String::length)).orElse("");
        //3-----------JAVA8-reduce()
      String  longest1=Arrays.stream(sentence.split(" ")).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).orElse("");
        System.out.println(longest+"_____"+longest.length());
    }
}
