#User function Template for python3

class Solution:
    def longestPalin(self, s):
        # code here
        if len(s)==0:
            return s
        start=0
        max_=0
        n=len(s)
        for i in range(n):
            l,r=i,i
            while l>=0 and r<n and s[l]==s[r]:
                if r-l+1>max_:
                    start=l
                    max_=r-l+1
                l-=1
                r+=1
            l,r=i,i+1
            while l>=0 and r<n and s[l]==s[r]:
                if r-l+1>max_:
                    start=l
                    max_=r-l+1
                l-=1
                r+=1
        return s[start:start+max_]
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        S = input()

        ob = Solution()

        ans = ob.longestPalin(S)

        print(ans)
# } Driver Code Ends