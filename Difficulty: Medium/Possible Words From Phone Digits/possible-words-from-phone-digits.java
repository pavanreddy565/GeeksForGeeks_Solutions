//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static void combo(int ind, String digits, HashMap<Character,String> map, String s, ArrayList<String> ans){
        if(digits.length()==0){
            return;
        }
        if(ind==digits.length()){
            ans.add(s);
            return;
        }if(!map.containsKey(digits.charAt(ind))){
            return;
        }
        String exp=map.get(digits.charAt(ind));
        for(int i=0;i<exp.length();i++){
            combo(ind+1,digits,map,s+exp.charAt(i),ans);
        }
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here
        char []arr = new char[N];
        for(int i=0;i<N;i++){
            arr[i]=Character.forDigit(a[i],10);
           // System.out.println(arr[i]);
            
        }
        String digits = new String(arr);
        HashMap<Character,String> map =new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        //System.out.println(digits);
        ArrayList<String> ans = new ArrayList<>();
        combo(0,digits,map,"",ans);
        return ans;
    }
}


