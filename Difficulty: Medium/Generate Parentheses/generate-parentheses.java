//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    List<String> parenthesis(char[] ans,int pos,int n, int open,int close, List<String> sol){
        if(close==n){
            sol.add(new String(ans));
            return sol;
        }
        if(open>close){
            ans[pos]=')';
            sol=this.parenthesis(ans,pos+1,n,open,close+1,sol);
        }if(open<n){
            ans[pos]='(';
            sol=this.parenthesis(ans,pos+1,n,open+1,close,sol);
        }return sol;
    }
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> arr = new ArrayList<>();
        char[] ans= new char[2*n];
        return this.parenthesis(ans,0,n,0,0,arr);
    }
}