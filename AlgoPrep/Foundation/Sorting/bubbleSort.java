import java.io.*;
import java.util.*;

public class Solution {   
    public static void bubbleSort(int arr[],int n){
        for(int i =0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//TC O(N^2)
//SC O(1)
