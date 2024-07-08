#User function Template for python3
class Solution:
    def upperbound(self, arr, n,x):
        low=0
        high=n-1
        ans=n
        while(low<=high):
            mid=(low+high)//2
            if arr[mid]>x:
                ans=mid
                high=mid-1
            else:
                low=mid+1
        return ans
    def lowerBound(self,arr,n,x):
        low=0
        high=n-1
        ans=n 
        while(low<=high):
            mid=(low+high)//2
            if arr[mid]>=x:
                ans=mid
                high=mid-1
            else:
                low=mid+1
        return ans
	def count(self,arr, n, x):
		# code here
		lb=self.lowerBound(arr,n,x)
		if lb==n or arr[lb]!=x:
		    return 0
		return self.upperbound(arr,n,x)-lb


#{ 
 # Driver Code Starts
#Initial Template for Python 3




if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.count(arr, n, x)
        print(ans)
        tc -= 1

# } Driver Code Ends