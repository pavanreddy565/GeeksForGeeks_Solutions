//{ Driver Code Starts
//Initial Template for Java

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
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans[] = obj.replaceWithRank(a,n);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
     // code here
    HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    int temp = 1;
    int n = arr.length;
    int brr[] = new int[n];
    for (int i = 0; i < n; i++) {
      brr[i] = arr[i];
    }
    Arrays.sort(brr);
    
    for (int i = 0; i < n; i++) {
      //if element is previously not store in the map
      if (mp.get(brr[i]) == null) {
        mp.put(brr[i], temp);
        temp++;
      }
    }for(int i=0;i<n;i++){
        brr[i]=mp.get(arr[i]);
    }return brr;

  }
}
     