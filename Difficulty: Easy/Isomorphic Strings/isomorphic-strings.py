#User function Template for python3
from collections import defaultdict
class Solution:
    
    #Function to check if two strings are isomorphic.
    def areIsomorphic(self,s,t):

        d1=defaultdict(lambda: "Not Present")
        d2=defaultdict(lambda: "Not Present")
        if len(s)!=len(t):
            return False
        for i in range(len(s)): 
            if d1[s[i]]=="Not Present" and d2[t[i]]=="Not Present":
                d1[s[i]]=t[i]
                d2[t[i]]=s[i]
            elif d1[s[i]]!=t[i] and d2[t[i]]!=s[i]:
                return False
        return True
#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys
from collections import defaultdict

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        s=str(input())
        p=str(input())
        ob = Solution()
        if(ob.areIsomorphic(s,p)):
            print(1)
        else:
            print(0)
# } Driver Code Ends