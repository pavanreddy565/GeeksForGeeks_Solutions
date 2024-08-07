#User function Template for python3
from collections import Counter
class Solution:
   
    #Function to sort the array according to frequency of elements.
    def sortByFreq(self,a,n):
        #code here
        d=dict(Counter(a))
        di=sorted(d.items(),key=lambda x:[-x[1],x[0]])
        ans=[]
        for i,j in di:
            ans.extend([i]*j)
        return ans    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())


if __name__ == '__main__':
    t = int(input())
    for tt in range(t):
        n=int(input())
        a = list(map(int, input().strip().split()))
        l = Solution().sortByFreq(a,n)
        print(*l)
# } Driver Code Ends