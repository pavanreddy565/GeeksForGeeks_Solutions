#User function Template for python3
class Solution:
	def print2largest(self,arr, n):
		# code here
		prev=-1
		maxel=arr[0]
		for i in arr:
		    if i>maxel:
		        prev=maxel
		        maxel=i
		    elif i>prev and i<maxel:
		        prev=i
		return prev
		


#{ 
 # Driver Code Starts
# Initial Template for Python 3
if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.print2largest(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends