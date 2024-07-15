#User function Template for python3
class Solution:
    def print2largest(self,arr):
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

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        ob = Solution()
        ans = ob.print2largest(arr)
        print(ans)

# } Driver Code Ends