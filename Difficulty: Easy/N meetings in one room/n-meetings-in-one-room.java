//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }

            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            n = a2.length;
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(a2[i]);
            }

            int ans = new Solution().maxMeetings(a, b);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class TimeSlot{
    int star,en;
    public TimeSlot(int star,int en){
        this.star=star;
        this.en=en;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        TimeSlot[] arr = new TimeSlot[start.length];
        for(int i=0;i<start.length;i++){
            arr[i]=new TimeSlot(start[i],end[i]);
        }
        Arrays.sort(arr,new Comparator<TimeSlot>(){
            @Override
            public int compare(TimeSlot t1,TimeSlot t2){
                return t1.en - t2.en;
            }
        });
        int count=1;
        int lastEnd = arr[0].en;
        for(int i=1;i<arr.length;i++){
             if (arr[i].star > lastEnd) {  
                count++;
                lastEnd = arr[i].en;
            }
        }return count;
    }
}
