//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int no_num(int[] arr, int N, int sum){
        int num=1,total=0;
        for(int i=0;i<N;i++){
            if(arr[i]+total<=sum)
                total+=arr[i];
            else{
                num++;
                total=arr[i];
            }
        }return num;
    }static int max(int[] arr, int N){
        int max_=arr[0];
        for(int i=1;i<N;i++){
            if(max_<arr[i])
                max_=arr[i];
        }return max_;
    }static int sumArray(int[] arr, int N){
        int sum_=0;
        for(int i=0;i<N;i++){
            sum_+=arr[i];
        }return sum_;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int l=max(arr,N);
        int h=sumArray(arr,N);
        while(l<=h){
            int mid=(l+h)/2;
            if(no_num(arr,N,mid)>K)
                l=mid+1;
            else
                h=mid-1;
        
        }return l;
    }
};