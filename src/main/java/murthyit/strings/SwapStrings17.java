//17.swap Two Strings Without Using Third Variable
package murthyit.strings;

public class SwapStrings17 {
    public static void main(String[] args){
        String str1 = "Java";
        String str2 = "Spring";
        System.out.println("Before Swapping");
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("\nAfter Swapping");
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);
    }
}
