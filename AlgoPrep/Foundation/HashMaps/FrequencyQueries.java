// Given N array elements and Q queries. For every query find frequency of element in array.
// Input Format

// First line contains 2 integers N, M denoting size of the array and the number of queries.
// Second line contains the elements of the array.
// Third line contains M elements representin queries.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int m=sc.nextInt();
        int queries[]=new int[m];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<m;i++){
            queries[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i =0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int i =0;i<m;i++){
            if(hm.containsKey(queries[i])){
                System.out.println(hm.get(queries[i]));
            }else{
                System.out.println(0);
            }
        }
    }
}
//TC O(N+M)
//SC O(N)
