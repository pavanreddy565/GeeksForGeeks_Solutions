//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		
System.out.println("~");
}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    static ArrayList<Integer> merge(int[] arr, ArrayList<Integer> ans){
        int n=arr.length,m=ans.size();
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int l=0, r=0;
        while(l<n && r<m){
            if(arr[l]<ans.get(r)){
                sol.add(arr[l]);
                l++;
            }else{
                sol.add(ans.get(r));
                r++;
            }
        }while(l<n){
            sol.add(arr[l]);
            l++;
        }while(r<m){
            sol.add(ans.get(r));
            r++;
        }return sol;
    }
    
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i< arr.length;i++){
            
            ans = merge(arr[i],ans);
            
        }return ans;
        
        
    }
}