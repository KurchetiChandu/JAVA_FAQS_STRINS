//1.Reverse a String
package murthyit.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString1 {

    public static void main(String[]args){
        String str="DAD1";
        String reverse="";
        //Method-1-------Forloop------------Interview Priority
        for(int i= str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        //Method-2-------char Array with forloop------------Interview Priority
        char[] arr=str.toCharArray();
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        //Method-3-------stringbuilder -reverse()------------simple
        String reverse1=new StringBuilder(str).reverse().toString();
        //Method-4-------stringbuilder -reverse() with java8 code------------more preferable
        String reverse2=new StringBuilder(str.chars().mapToObj(c->String.valueOf(((char)c))).collect(Collectors.joining())).reverse().toString();
        System.out.println("Java8code-----:"+reverse2);
        //Method-5-------Pure java8 code------------more preferable
        String rev=IntStream.rangeClosed(1,str.length()).mapToObj(i->String.valueOf(str.charAt(str.length()-i))).reduce("",String::concat);
        System.out.println("PUREJava8code-----:"+rev);
        System.out.println();
        System.out.println(reverse);
        System.out.println();
        System.out.println(reverse1);

    }

}
