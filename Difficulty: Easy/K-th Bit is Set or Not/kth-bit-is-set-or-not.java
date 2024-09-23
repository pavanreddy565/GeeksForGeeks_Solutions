//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class CheckBit {
    // Function to check if Kth bit is set or not.
    static ArrayList<Integer> dec2bin(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        while(n!=0){
            if(n%2==1){
                ans.add(1);
            }else{
                ans.add(0);
            }
            n=n/2;
        }return ans;
    }
    
    static int bin2dec(ArrayList<Integer> bin){
        int num=0;
        for(int i=0;i<bin.size();i++){
            num+=(bin.get(i)*Math.pow(2,i));
        }return num;
    }
    
    static boolean checkKthBit(int n, int k) {
        // Your code here
         ArrayList<Integer> ans=dec2bin(n);
         if(k>=ans.size()) return false;
         return ans.get(k)==1;
    }
}

//{ Driver Code Starts.

class GFG {
    static int n;
    static int k;

    // Driver Code
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // Inputting the testcases

        while (t > 0) // While testcases exist
        {

            n = Integer.parseInt(br.readLine()); // Input N
            k = Integer.parseInt(br.readLine()); // Input K

            CheckBit obj = new CheckBit();

            if (obj.checkKthBit(n, k))
                System.out.println("Yes"); // If true, print Yes

            else
                System.out.println("No"); // Else print No

            t--;
        }
    }
}
// } Driver Code Ends