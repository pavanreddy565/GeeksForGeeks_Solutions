//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] nums) {
        // code here
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }//System.out.println(index);
        if(index==-1){
            int l=0,r=n-1,temp=0;
            while(l<r){
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l+=1;
                r-=1;
            }return ;
        }
        int tem=0;
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                tem=nums[i];
                nums[i]=nums[index];
                nums[index]=tem;
                break;
            }
        } int l=index+1,r=n-1,temp=0;
        while(l<r){
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l+=1;
                r-=1;
        }
    }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends