#User function Template for python3
# import java.util.Arrays;
class Solution:
    #Function to sort a list using quick sort algorithm.
    def quickSort(self,arr,low,high):
        # code here
        arr.sort()
    
    def partition(self,arr,low,high):
        # code here
        pass
    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    for i in range(t):

        arr = list(map(int, input().split()))
        n = len(arr)
        Solution().quickSort(arr, 0, n - 1)
        for i in range(n):
            print(arr[i], end=" ")
        print()
        print("~")

# } Driver Code Ends