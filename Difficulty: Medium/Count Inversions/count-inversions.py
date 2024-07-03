class Solution:
    #User function Template for python3
    
    # arr[]: Input Array
    # N : Size of the Array arr[]
    #Function to count inversions in the array.
    def merge(self,arr, l, m, r): 
        # code here
        left=l
        right=m+1
        temp=[]
        count=0
        while(left<m+1 and right<r+1):
            if arr[left]<=arr[right]:
                temp.append(arr[left])
                left+=1
            else:
                temp.append(arr[right])
                count+=(m-left+1)
                right+=1
        while left<m+1:
            temp.append(arr[left])
            left+=1
        while right<r+1:
                temp.append(arr[right])
                right+=1
        for i in range(l,r+1):
            arr[i]=temp[i-l]
        return count
    def mergeSort(self,arr, l, r):
        #code here
        
        if l>=r:
            return 0
        mid=(l+r)//2
        return self.mergeSort(arr,l,mid)+self.mergeSort(arr,mid+1,r)+self.merge(arr,l,mid,r)
    def inversionCount(self, arr, n):
        # Your Code Here
        return self.mergeSort(arr,0,n-1)
        
        
        
#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER


@atexit.register
def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())


if __name__ == '__main__':
    t = int(input())
    for tt in range(t):
        n = int(input())
        a = list(map(int, input().strip().split()))
        obj = Solution()
        print(obj.inversionCount(a, n))

# } Driver Code Ends