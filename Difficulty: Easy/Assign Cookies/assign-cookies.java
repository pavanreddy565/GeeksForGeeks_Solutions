//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        for (int tc = 0; tc < t; tc++) {
            String[] greedStr = sc.nextLine().split(" ");
            String[] cookieStr = sc.nextLine().split(" ");

            int[] greed = Arrays.stream(greedStr).mapToInt(Integer::parseInt).toArray();
            int[] cookie =
                Arrays.stream(cookieStr).mapToInt(Integer::parseInt).toArray();

            Solution obj = new Solution();
            System.out.println(obj.maxChildren(greed, cookie));
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends



class Solution {
    public int maxChildren(int[] g, int[] s) {
        // Your code goes here.
        Arrays.sort(g);
        Arrays.sort(s);

        int l=0,r=0,count=0;
        while(l<s.length&&r<g.length){
            if(s[l]>=g[r]){
                count++;
                r++;
            }l++;
        }return count;
    }
}