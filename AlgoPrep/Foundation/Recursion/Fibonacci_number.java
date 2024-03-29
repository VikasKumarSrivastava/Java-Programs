import java.io.*;
import java.util.*;

public class Solution {
    public static int fib(int n){
        if(n==0||n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}
