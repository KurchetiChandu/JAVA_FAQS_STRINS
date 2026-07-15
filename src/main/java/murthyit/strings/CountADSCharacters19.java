//19. Count Alphabets, Digits, and Special Characters
package murthyit.strings;

import java.util.stream.Collectors;

public class CountADSCharacters19 {
   public  static void main(String[] args) {
       String str = "Java8@2025#";
       //------1---------Normal Approach
       int alphabets=0,digits=0,specialChars=0;
       for(char ch:str.toLowerCase().toCharArray()){
           if(Character.isLetter(ch)){
               alphabets++;
           } else if (Character.isDigit(ch)) {
               digits++;
           }else{
               specialChars++;
           }
       }
       System.out.println("Alphabets: " + alphabets);
       System.out.println("Digits: " + digits);
       System.out.println("Special Characters: " + specialChars);
       //------2---------JAVA8
       /*----------------Approach1
       str.toLowerCase().chars().forEach(ch->{
           if(Character.isLetter(ch)){
               alphabets++;
           } else if (Character.isDigit(ch)) {
               digits++;
           }else{
               specialChars++;
           }
       });
       System.out.println("Alphabets: " + alphabets);
       System.out.println("Digits: " + digits);
       System.out.println("Special Characters: " + specialChars );*/
       //----------------Approach2
      long alphabets1=str.chars().filter(ch->Character.isLetter(ch)).count();
      long digits1=str.chars().filter(ch->Character.isDigit(ch)).count();
       long specialChars1=str.chars().filter(ch->!Character.isLetterOrDigit(ch)).count();
       //print
       System.out.println("Alphabets: " + alphabets1);
       System.out.println("Digits: " + digits1);
       System.out.println("Special Characters: " + specialChars1);
       //----------------Approach3
       /*str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(ch->{
           if(Character.isLetter(ch)){
               return "Alphabets";
           } else if (Character.isDigit(ch)) {
               return "Digits";
           }else{
               return "Special Characters";
           }
       },Collectors.counting())).forEach((k,v)->System.out.println(k + ": " + v));
*/
    }
}
