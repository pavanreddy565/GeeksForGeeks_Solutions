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
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        if(hand.length%groupSize !=0) return false;
         HashMap<Integer,Integer> map = new HashMap<>();
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i : hand){
            if(! map.containsKey(i)){
                map.put(i,1);
                pq.add(i);
            }else{
                map.put(i, map.get(i)+1);
            }
         }
         while(pq.size()>0){
            int minH=pq.peek();
           // System.out.println(minH);
            for(int i=minH;i<minH+groupSize;i++){
                if(! map.containsKey(i)) return false;
                else{
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0){
                        //System.out.println(i+" "+minH);
                        if(i!=pq.peek()) return false;
                        pq.poll();
                        
                    }
                }
            }
         }return true;
    }
}
