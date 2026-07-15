//Check if a String is Palindrome
package murthyit.strings;
public class PalindromeChecker2 {
    public static void main(String[] args) {
        String originalString="MADAM";
        String reversedString="";
        for(int i=originalString.length()-1;i>=0;i--){
            reversedString += originalString.charAt(i);
        }
        System.out.println(reversedString);
        if(originalString.equals(reversedString)){
            System.out.println("The "+originalString+" is Plaindrome");
        }else{
            System.out.println("The "+originalString+" is Not Plaindrome");
        }

    }
}
