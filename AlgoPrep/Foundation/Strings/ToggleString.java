import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] ch=st.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]=(char)(ch[i]+32);
            }else{
                ch[i]=(char)(ch[i]-32);
            }
        }
        System.out.println(ch);
    }
}

//TC O(N)
//SC O(1)
