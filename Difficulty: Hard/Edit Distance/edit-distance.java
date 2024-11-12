//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution ob = new Solution();
            int ans = ob.editDistance(s1, s2);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    void print(int[][] ans,int n1,int n2){
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(ans[i][j]+" ");
            }System.out.println();
        }
    }
    int editArray(String s1,String s2,int n1,int n2){
        int[][] ans = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0){
                    ans[i][j]=j;
                }else if(j==0){
                    ans[i][j]=i;
                }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }else{
                    int r_=Math.min(ans[i-1][j],ans[i][j-1]);
                    ans[i][j]=1+Math.min(r_,ans[i-1][j-1]);
                }
            }
        }//print(ans,n1,n2);
        return ans[n1][n2];
    }
    public int editDistance(String s1, String s2) {
        // Code here
        int arr=editArray(s1,s2,s1.length(),s2.length());
        return arr;
    }
}