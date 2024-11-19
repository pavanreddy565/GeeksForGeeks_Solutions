//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            long ans = ob.maximumSumSubarray(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long maximumSumSubarray(int[] arr, int k) {
        // Code here
        int l=0,r=0,n=arr.length;
        long sum=0,maxSum=0;
        while(r<n){
            while(r - l + 1 >k){
                sum-=arr[l];
                //if(map.containsKey(nums[l])) map.remove(nums[l]);
                l++;
                
            }//while(map.containsKey(nums[r])&&map.get(nums[r])==1){
            //     sum-=nums[l];
            //     if(map.containsKey(nums[l])) map.remove(nums[l]);
            //     l++;
                
            // }
            
            sum+=arr[r];
            
            //map.put(nums[r],1);
            r++;
            //System.out.println(sum+" "+r+" "+l+" "+k);
            if(r - l  == k)
                maxSum=Math.max(sum,maxSum);
            
        }return maxSum;

    }
}