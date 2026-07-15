package murthyit.strings;

public class CountVowelsConsonants3 {
    public static void main(String[] args) {
        String str = "Java Interview 2026";
        //--Method-1-----------Normal Approach--------------Interview Purpose
        int vowels = 0;
        int consonants = 0;
        for(char ch:str.toLowerCase().toCharArray()){
            /*if(Character.isDigit(ch)){
                System.out.println(ch+"---Not a Letter its a Digit");
            }else if(ch == ' '){
                System.out.println(ch+"Space---Not a Letter its a Space");
            }*/
            if(Character.isLetter(ch)){
                //if("aeiou".indexof(ch)!=-1){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                //}
                }else{
                    consonants++;
                }
            }
        }
        //--Method-2-----------Java8 --------------Interview Purpose
        long Vowels1=str.toLowerCase().chars().filter(Character::isLetter).filter(ch->"aeiou".indexOf(ch) != -1).count();
        long Consonats1=str.toLowerCase().chars().filter(Character::isLetter).filter(ch -> "aeiou".indexOf(ch) == -1).count();

        System.out.println("String-----"+str);
        System.out.println("Vowels------------->"+vowels);
        System.out.println("Consonants------------->"+consonants);
        System.out.println("Vowels1------------->"+Vowels1);
        System.out.println("Consonants1------------->"+Consonats1);
    }
}