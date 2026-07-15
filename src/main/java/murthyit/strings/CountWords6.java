//6. Count Number of Words in a Sentence
package murthyit.strings;

import java.util.Arrays;

public class CountWords6 {
    //-1-------Normal Approach
   public static int countWords(String sentence){
      long countWords=0;
       if(sentence == null || sentence.trim().isEmpty()){
           return 0;
       }
      String[] words=sentence.trim().split("\\s+");
       return words.length;
    }
   static String sentence = "Java is easy to learn";
    public static void main(String[] args) {
        System.out.println(countWords(sentence));
        //-2-------Java 8
        long   count=Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println(count);
    }
}
