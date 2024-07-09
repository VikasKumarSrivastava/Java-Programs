//Find the first non-repeating element in a given array arr of N integers.
//GFG Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1
import java.io.*;
import java.util.*;

public class Solution {
    public static int solve(int[] arr, int n){
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i =0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int v:arr){
            if(hm.get(v)==1){
                return v;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans= solve(arr,n);
        System.out.println(ans);

    }
}
//TC O(N)
//SC O(N)
