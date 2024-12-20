//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int fives=0;
        int tens=0;
        //Arrays.sort(bills);
        //print(bills);
        for(int i=0;i<bills.length;i++){
            //System.out.print(fives+" ");
            if(bills[i]==5){
                fives++;
            }else if(bills[i]==10){
                if(fives==0){
                    return false;
                }
                tens++;
                
                fives--;
            }else{
                if(tens>0&&fives>0){
                    tens--;
                    fives--;
                }else if(fives>2) fives-=3;
                else return false;
            }
        }return true;
    }
}
