//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends




//User function Template for Java

 class Solution{
    static long no_num(int[] arr, int N, long sum){
        int num=1;
        long total=0;
        for(int i=0;i<N;i++){
            if(arr[i]+total<=sum)
                total+=arr[i];
            else{
                num++;
                total=arr[i];
            }
        }return num;
    }static long max(int[] arr, int N){
        long max_=arr[0];
        for(int i=1;i<N;i++){
            if(max_<arr[i])
                max_=arr[i];
        }return max_;
    }static long sumArray(int[] arr, int N){
        long sum_=0;
        for(int i=0;i<N;i++){
            sum_+=arr[i];
        }return sum_;
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        long l=max(arr,n);
        long h=sumArray(arr,n);
        while(l<=h){
            long mid=(l+h)/2;
            if(no_num(arr,n,mid)>k){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }return l;
    }
}


