#User function Template for python3

class Solution:
    def maxDepth(self, s):
        # Code here
        stack=[]
        max_=0
        for i in s:
            if i=='(':
                stack.append(i)
                max_=max(max_,len(stack))
            elif i==')':
                stack.pop()
        return max_

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        ob = Solution()
        print(ob.maxDepth(s))
# } Driver Code Ends