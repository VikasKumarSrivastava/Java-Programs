import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPalindrome(char str[],int s,int e){
        if (s>=e)
            return true;
        if(str[s]==str[e]){
            return isPalindrome(str,s+1,e-1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start =0;
        int end = s.length() -1;
        char arr[]=s.toCharArray();
        boolean ans = isPalindrome(arr,start,end);
        
        System.out.println(ans);
    }
}
//TC O(N)
//SC O(N)
