//22. String Compression (e.g., aaabb -> a3b2)
/*This problem depends on consecutive characters, so using Streams is not recommended
because Streams don't naturally maintain run-length state.*/
package murthyit.strings;

public class StringCompression22 {
    public static void main(String[] args){
        String str="aaabb";
       System.out.println(compress(str));
    }
  public static String compress(String str){
        if(str==null||str.isEmpty()){
            return "";
        }
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1));
                result.append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1));
        result.append(count);
    return result.toString();
    }
}
