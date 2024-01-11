import java.io.*;
import java.util.*;

public class Solution {
    
    public static long powerCal(long base,long power){
        if(power==1)
            return base;
        long temp= powerCal(base,power/2);
        if(power%2==0)
            return temp*temp;
        else
            return temp*temp*base;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long base = sc.nextInt();
        long power = sc.nextInt();
        long ans  = powerCal(base,power);
        System.out.println(ans);
    }
}
