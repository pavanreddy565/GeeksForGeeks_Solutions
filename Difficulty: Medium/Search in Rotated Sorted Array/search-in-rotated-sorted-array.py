#User function Template for python3

class Solution:
    def searchk(self,arr, n, k):
        low = 0
        high = n - 1
        while low <= high:
            mid = (low + high) // 2
    
            # if mid points the target
            if arr[mid] == k:
                return mid
    
            # if left part is sorted
            if arr[low] <= arr[mid]:
                if arr[low] <= k and k <= arr[mid]:
                    # element exists
                    high = mid - 1
                else:
                    # element does not exist
                    low = mid + 1
            else:  # if right part is sorted
                if arr[mid] <= k and k <= arr[high]:
                    # element exists
                    low = mid + 1
                else:
                    # element does not exist
                    high = mid - 1
        return -1
    def search(self,arr,key):
        # Complete this function
        return self.searchk(arr,len(arr),key)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        k = int(input())
        ob = Solution()
        print(ob.search(A, k))

# } Driver Code Ends