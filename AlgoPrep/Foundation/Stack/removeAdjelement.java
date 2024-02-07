import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        System.out.println(Removeadjacentduplicate(s));
    }
    
    public static String Removeadjacentduplicate(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }
            
            if(st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        char[] arr = new char[st.size()];
        
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = st.pop();
        }
        
        return String.valueOf(arr);
    }
}
