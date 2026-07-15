//4.Check if a String Contains Only Digits
package murthyit.strings;

public class CheckOnlyDigits4 {
    //--1------------Interview Approach-------Normal
    public static boolean    onlyDigits(String str){
        if(str==null || str.isEmpty()){
            return false;
        }
       for(int i=0;i<str.length();i++){
           if(!Character.isDigit(str.charAt(i))){
               return false;
           }
       }
       return true;
    }
    //----2---------Regular Exp
    public  static boolean onlyDigits1(String str){
        return str!=null && !str.isEmpty() && str.matches("\\d+");
    }
    //---3-------Java8-----
    public static boolean onlyDigits2(String str){
        return str!=null && !str.isEmpty() && str.chars().allMatch(Character::isDigit);
    }
    public static void main(String[] args) {
        //System.out.println(onlyDigits(""));
        //System.out.println(onlyDigits("Siva"));
        //System.out.println(onlyDigits(null));
        System.out.println(onlyDigits2("123"));

    }
}
