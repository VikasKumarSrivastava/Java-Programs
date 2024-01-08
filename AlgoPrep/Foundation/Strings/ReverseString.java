import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] ch = st.toCharArray();
        int sp = 0;
        int ep=ch.length-1;
        while(sp<ep){
            char temp = ch[sp];
            ch[sp]=ch[ep];
            ch[ep]=temp;
            sp++;
            ep--;
        }
        System.out.println("".valueOf(ch));
    }
}
//TC O(N)
//SC O(N)
