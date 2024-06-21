#User function Template for python3


class Solution:
    def compareFrac (self, str):
        
        # code here
        a,b=str.split(',')
        b=b[1:]
        a1,b1=map(int,a.split('/'))
        a2,b2=map(int,b.split('/'))
        num_a=a1/b1
        num_b=a2/b2
        if num_a>num_b:
            return a
        elif num_a==num_b:
            return 'equal'
        return b
            
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3
import re

if __name__ == '__main__':
    ob = Solution()
    t = int(input())
    for _ in range(t):
        str = input()
        print(ob.compareFrac(str))

# } Driver Code Ends