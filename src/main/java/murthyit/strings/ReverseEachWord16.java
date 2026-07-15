//16.ReverseEachWord
package murthyit.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord16 {
    public static void main(String[] args){
        String sentence = "Java is awesome";
        //---------1--------2--StringBuilders
        StringBuilder result=new StringBuilder();
        for(String word:sentence.split(" ")){
            StringBuilder reverseWord= new StringBuilder(word);
            result.append(reverseWord.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
        //---------2--------StringBuilder with inner forloop
        StringBuilder sb1=new StringBuilder();
        for(String word:sentence.split(" ")){
            for(int i=word.length()-1;i>=0;i--){
                sb1.append(word.charAt(i));
            }
            sb1.append(" ");
        }
        System.out.println(sb1.toString().trim());
        //---------3--------Java8
         String result1=Arrays.stream(sentence.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
         System.out.println(result1);
    }
}
