#User function Template for python3
import math
class Solution:
    def smallestDivisor(self, nums, K):
        # Code here
        small_num=float('inf')
        l=1
        h=max(nums)
        ans=float("inf")
        while l<=h:
            mid=(l+h)//2
            num=sum([math.ceil(j/mid) for  j in nums])
            #print(num," ",mid)
            if num<=K:
                #print(mid,"ans",ans)
                ans=min(ans,mid)
                h=mid-1
            else:
                l=mid+1
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        n, K = list(map(int, input().split()))
        nums = list(map(int, input().split()))
        ob = Solution()
        res = ob.smallestDivisor(nums, K)
        print(res)
# } Driver Code Ends