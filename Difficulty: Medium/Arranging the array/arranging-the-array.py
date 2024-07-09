
from typing import List


class Solution:
    # def merge(self,arr,low,mid,high):
    #     l=low
    #     r=mid+1
    #     temp=[]
    #     while l<mid+1  and r<high+1 and (arr[l]<0 or arr[r]<0):
    #         if arr[l]<0:
    #             temp.append(arr[l])
    #             l+=1
    #         elif arr[r]<0:
    #             temp.append(arr[r])
    #             r+=1
    #     while(l<mid+1):
    #         temp.append(arr[l])
    #         l+=1
    #     while(r<high+1):
    #         temp.append(arr[r])
    #         r+=1
    #     for i in range(low,high):
    #         arr[i]=temp[i-low]
    #     print(arr)
    # def mergeSort(self,arr,low,high):
    #     if low>=high:
    #         return 
    #     mid=(low+high)//2
        
    #     self.mergeSort(arr,low,mid)
    #     self.mergeSort(arr,mid+1,high)
    #     self.merge(arr,low,mid,high)
    def Rearrange(self, n : int, arr : List[int]) -> None:
        # code here
        # self.mergeSort(arr,0,n-1)
        neg=[]
        pos=[]
        for i in arr:
            if i<0:
                neg.append(i)
            else:
                pos.append(i)
        neg.extend(pos)
        for i in range(n):
            arr[i]=neg[i]
        
        
        



#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        arr=IntArray().Input(2)
        
        obj = Solution()
        obj.Rearrange(n, arr)
        
        print(*arr, end=' ')
        print()

# } Driver Code Ends