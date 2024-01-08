package venkateshPractise;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("SILENT","listen"));
    }
    public static boolean isAnagram(String s1,String s2){
        String str1=s1.replace(" ","");
        String str2=s2.replace(" ","");
        if(str1.length()!=str2.length()){
            return false;
        }else {
            char[]a1=str1.toLowerCase().toCharArray();
            char[]a2=str2.toLowerCase().toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1,a2);
        }
    }
}
