//5.Convert String to Uppercase/Lowercase
package murthyit.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperLowerExample5 {
    public static void main(String[] args){
        String str="Java Backend Developer";
        //------1----Built-in-Methods
       String lowerCase= str.toLowerCase();
       String upperCase=str.toUpperCase();
        //------2----Java8 with single String
      String  lowerCase1=Stream.of(str).map(c->c.toLowerCase()).findFirst().orElse("");
      String upperCase1=Stream.of(str).map(String::toUpperCase).findFirst().orElse("");
       //------3----Java8 with Multiple String
        List<String> names=Arrays.asList("JAVA","SPRING","HIBERNATE");
       List<String> lowerCase2=names.stream().map(c->c.toLowerCase()).collect(Collectors.toList());
       List<String> upperCase2=names.stream().map(String::toUpperCase).collect(Collectors.toList());
       System.out.println("String-----"+str);
       System.out.println("lowercase----"+lowerCase2);
       System.out.println("UpperCase----"+upperCase2);
    }
}
