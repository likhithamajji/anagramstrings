import java.util.*;
public class anagram{
    public static void main(String[] args){
        String s1="likitha";
        String s2="divyalikitha";
        if(anagram(s1,s2)){
            System.out.println("s1 and s2 are anagrams");
        }else{
            System.out.println("s1 and s2 are not anagrams");
        }
    }
    public static boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return true;
        }else{
            return false;
        }
    }
}