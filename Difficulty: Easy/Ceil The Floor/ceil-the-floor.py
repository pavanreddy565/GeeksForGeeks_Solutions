#User function Template for python3


def getCeli(arr,x,n):
    low=0
    high=n-1
    ans=-1
    #print('celi',arr)
    while(low<=high):
        mid=(low+high)//2
        if arr[mid]>=x:
            ans=arr[mid]
            high=mid-1
        else:
            low=mid+1
    return ans

def getFloor(arr,x,n):
    low=0
    high=n-1
    ans=-1
    while(low<=high):
        mid=(low+high)//2
        if arr[mid]<=x:
            ans=arr[mid]
            low=mid+1
        else:
            high=mid-1
    return ans
def getFloorAndCeil(arr, n, x):
    # code here
    arr.sort()
    return [getFloor(arr,x,n),getCeli(arr,x,n)]


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))

        ans = getFloorAndCeil(arr, n, x)
        print(str(ans[0]) + " " + str(ans[1]))
        tc -= 1

# } Driver Code Ends