//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.findPages(n, a, m));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find minimum number of pages.
    static int pages(int[]arr, int n, int k){
        int no=1;
        int total=0;
        for(int i=0;i<n;i++){
            if(arr[i]+total<=k)
                total+=arr[i];
            else{
                no++;
                total=arr[i];
            }
        }return no;
    }static int max(int n, int[] arr){
        int max_= arr[0];
        for(int i=0;i<n;i++){
            if(max_<arr[i]){
                max_=arr[i];
            }
        }return max_;
    }static int sum(int n, int[] arr){
        int sum_=arr[0];
        for(int i=0;i<n;i++){
            sum_+=arr[i];
        }return sum_;
    }
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if(m>n){
            return -1;
        }
        int l=max(n,arr),h=sum(n,arr);
        while(l<=h){
            int mid=(l+h)/2;
            if(pages(arr,n,mid)>m)
                l=mid+1;
            else
                h=mid-1;
        
        }return l;
    }
};