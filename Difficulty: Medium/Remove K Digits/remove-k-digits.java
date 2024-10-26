//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String num, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() &&k>0&& st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }//System.out.println(st);
            st.push(num.charAt(i));
        }
        //System.out.println("ans"+st);
        ArrayList<Character> ans = new ArrayList<>();
        int n=st.size();
        
        while(!st.empty() && k>0){
                st.pop();
                k--;
                n--;
        }
        
        for(int i=0;i<n;i++){
            ans.add(st.pop());
            //System.out.println(st);
        }
        while(ans.size()>0 && ans.get(ans.size()-1)=='0'){
            ans.remove(ans.size()-1);
        }
        if(ans.size()==0) return "0";
        char a[] = new char[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[ans.size()-i-1]=ans.get(i);
        }
        
        return new String(a);
    }
}