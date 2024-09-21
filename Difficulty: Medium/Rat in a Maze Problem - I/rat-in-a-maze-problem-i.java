//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    public String convertString(ArrayList<Character> ele){
        char[] arr = new char[ele.size()];
        for(int i=0;i<ele.size();i++){
            arr[i]=ele.get(i);
        }
        return new String(arr);
    }
    public void find(int row, int col,int [][] mat,int n, ArrayList<String> ans,ArrayList<Character> ele){
        if(row<0 || col<0 || row>=n||col>=n || mat[row][col]==0){
            return;
        }
        if(row==n-1 && col==n-1){
            ans.add(convertString(ele));
            return;

        }
        
        mat[row][col]=0;
        ele.add('U');
        find(row-1,col,mat,n,ans,ele);
        ele.remove(ele.size()-1);
        
        ele.add('D');
        find(row+1,col,mat,n,ans,ele);
        ele.remove(ele.size()-1);
        
        ele.add('L');
        find(row,col-1,mat,n,ans,ele);
        ele.remove(ele.size()-1);
        
        ele.add('R');
        find(row,col+1,mat,n,ans,ele);
        ele.remove(ele.size()-1);
        
        mat[row][col]=1;
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        find(0,0,mat,mat.length,ans,new ArrayList<Character>());
        return ans;
    }
}