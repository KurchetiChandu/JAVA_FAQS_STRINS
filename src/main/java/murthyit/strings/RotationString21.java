//21.Check if a String is a Rotation of Another
package murthyit.strings;

import javax.print.DocFlavor;
import java.util.Optional;

public class RotationString21 {
    public static void main(String[] args){
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(isRotation(s1,s2));
        System.out.println(isRotation1(s1,s2));
    }
    //1----------NoramalApproach
  public static boolean isRotation(String str1,String str2){
        if(str1==null||str2==null){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        return (str1+str2).contains(str2);
    }
    //2----------Java8
   public static boolean isRotation1(String s1,String s2){
        return Optional.ofNullable(s1).filter(str->s2!=null)
                                      .filter(str->str.length()==s2.length())
                                      .map(str->str+str)
                                      .map(str->str.contains(s2)).orElse(false);
    }

}
