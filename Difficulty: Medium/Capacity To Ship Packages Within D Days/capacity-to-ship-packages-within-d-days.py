#User function Template for python3

class Solution:
    def leastWeightCapacity(self, arr, n, d):
        # code here 
        l=max(arr)
        h=sum(arr)
        while l<=h:
            mid=(l+h)//2
            load=0
            days=1
            for i in arr:
                if load+i>mid:
                    days+=1
                    load=i
                else:
                    load+=i
            if days<=d:
                h = mid-1
            else:
                l=mid+1
        return l


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        arr = list(map(int, input().split()))
        D = int(input())

        ob = Solution()
        print(ob.leastWeightCapacity(arr, N, D))

# } Driver Code Ends