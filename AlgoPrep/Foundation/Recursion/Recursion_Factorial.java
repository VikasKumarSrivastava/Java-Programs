import java.io.*;
import java.util.*;

public class Solution {
    
    public static int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans= fact(n);
        System.out.println(ans);
    }
}
