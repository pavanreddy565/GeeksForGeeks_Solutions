//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String s) {
        // code here
        for(int i=s.length()-1;i>=0;i--){
            int num=Integer.parseInt(String.valueOf(s.charAt(i)));
            //System.out.print(num);
            if(num%2!=0){
                return s.substring(0,i+1);
            }
        }return "";
    }
}