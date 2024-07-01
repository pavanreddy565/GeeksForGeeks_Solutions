#User function Template for python3

class Solution:
    def merge(self,arr, l, m, r): 
        # code here
        left=l
        right=m+1
        temp=[]
        while(left<m+1 and right<r+1):
            if arr[left]<arr[right]:
                temp.append(arr[left])
                left+=1
            else:
                temp.append(arr[right])
                right+=1
        while left<m+1:
            temp.append(arr[left])
            left+=1
        while right<r+1:
                temp.append(arr[right])
                right+=1
        for i in range(l,r+1):
            arr[i]=temp[i-l]
    def mergeSort(self,arr, l, r):
        #code here
        
        if l>=r:
            return 
        mid=(l+r)//2
        self.mergeSort(arr,l,mid)
        self.mergeSort(arr,mid+1,r)
        self.merge(arr,l,mid,r)



#{ 
 # Driver Code Starts
#Initial Template for Python 3


import sys
input = sys.stdin.readline
if __name__ == "__main__":
    t=int(input())
    for i in range(t):
        n=int(input())
        arr=list(map(int,input().split()))
        Solution().mergeSort(arr, 0, n-1)
        for i in range(n):
            print(arr[i],end=" ")
        print()
# } Driver Code Ends