#User function Template for python3
class Solution:

	# Function to find maximum
	# product subarray
	def maxProduct(self,arr, n):
		# code here
		suf=1
        pre=1
        ans=-10**6
        # n=len(nums)
        for i in range(n):
            if pre==0:
                pre=1
            if suf==0:
                suf=1
            pre*=arr[i]
            suf*=arr[n-i-1]
            ans=max(ans,max(pre,suf))
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.maxProduct(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends