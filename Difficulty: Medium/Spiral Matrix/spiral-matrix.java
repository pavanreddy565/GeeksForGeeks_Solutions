//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int l=0,r=m-1,t=0,b=n-1;
	    int[] arr=new int[n*m];
	    int num=1;
	    
	    while(l<=r && t<=b){
	        for(int i=l;i<=r;i++){
	            
	            if(num==k)
	                return a[t][i];
	            num++;
	        }t++;
	        
	        for(int i=t;i<=b;i++){
	            
	            if(num==k)
	                return a[i][r];
	            num++;
	        }r--;
	        
	        for(int i=r;i>=l;i--){
	            
	           
	            if(num==k)
	                return a[b][i];
	            num++;
	        }b--;
	        for(int i=b;i>=t;i--){
	           
	            
	            if(num==k)
	                return a[i][l];
	            num++;
	        }l++;
	   
	   }//this.print(arr);
	   return arr[k-1];
	}
	
}