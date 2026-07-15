//8.Compare Two Strings (equals, compareTo, ==)
package murthyit.strings;

import java.util.Arrays;
import java.util.List;

public class CompareStrings8 {
    public static void main(String[] args){
        String s1 = new String("Java");
        String s2 = new String("Java");
    //------1---Normal Aprroach
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        //------2---JAVA8
           //-------equals()
           List<String> names=Arrays.asList("Java", "Spring", "Java", "SQL");
         names.stream().filter(name->name.equals("Java")).forEach(System.out::println);
        //-------compareTo()
        names.stream().sorted(String::compareTo).forEach(System.out::println);


    }
}
