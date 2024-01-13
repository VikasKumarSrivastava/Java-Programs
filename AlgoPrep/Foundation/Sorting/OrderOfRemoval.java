import java.io.*;
import java.util.*;

public class Solution {
    
    public static int orderOfRemoval(int arr[],int n){
        Arrays.sort(arr);
        int sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i]*(n-i);
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = orderOfRemoval(arr,n);
        System.out.println(ans);
    }
}

//TC O(nlogn)
//SC O(1)
