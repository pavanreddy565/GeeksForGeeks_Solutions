//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int HistoArea(int[] histo){
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
    
    public int maxArea(int matrix[][], int n, int m) {
        // add code here.
        int max_=0;
        int []arr = new int[matrix[0].length];
        //print(arr);
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                int num=matrix[i][j];
                arr[j]+=num ;
                //print(arr);
                if(matrix[i][j]==0) arr[j]=0;
            }//print(arr);
            int m_=HistoArea(arr);
            //System.out.println(m);
            max_=Math.max(max_,m_);
        }return max_;
    }
}