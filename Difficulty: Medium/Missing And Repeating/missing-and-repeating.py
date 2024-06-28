#User function Template for python3
from collections import Counter
class Solution:
    def findTwoElement( self,arr, n): 
        # code here
        d=dict(Counter(arr))
        
        for i in range(1,n+1):
            if i not in d.keys():
                miss=i
            elif d[i]>1:
                highest=i
        return [highest,miss]
        

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 

    tc=int(input())
    while tc > 0:
        n=int(input())
        arr=list(map(int, input().strip().split()))
        ob = Solution()
        ans=ob.findTwoElement(arr, n)
        print(str(ans[0])+" "+str(ans[1]))
        tc=tc-1
# } Driver Code Ends