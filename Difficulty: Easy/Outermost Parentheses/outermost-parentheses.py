#{ 
 # Driver Code Starts


#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

class Solution:
    def removeOuter(self, S):
        # Code here
        count=0
        min_=0
        ans=""
        for i in range(len(S)):
            if S[i]=='(':
                count+=1
            else:
                count-=1
            #print(count,"min",min_)
            if count==0:
                ans+=S[min_+1:i]
                min_=i+1
        return ans

#{ 
 # Driver Code Starts.
if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        s = input()
        ob = Solution()
        res = ob.removeOuter(s)
        print(res)
# } Driver Code Ends