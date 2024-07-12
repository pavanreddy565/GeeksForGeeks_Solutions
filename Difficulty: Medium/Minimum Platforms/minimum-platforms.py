#User function Template for python3

class Solution:    
    #Function to find the minimum number of platforms required at the
    #railway station such that no train waits.
    def countPlatforms(self,arr, dep):
        arr.sort()
        dep.sort()
    
    
        ans = 1
        count = 1
        i = 1
        j = 0
        while i < len(arr) and j < len(dep):
            if arr[i] <= dep[j]:  # one more platform needed
                count += 1
                i += 1
            else:  # one platform can be reduced
                count -= 1
                j += 1
            ans = max(ans, count)  # updating the value with the current maximum
        return ans
    def minimumPlatform(self,n,arr,dep):
        # code here
        return self.countPlatforms(arr,dep)


#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

#Contributed by : Nagendra Jha


if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases) :
        n = int(input())
        arrival = list(map(int, input().strip().split()))
        departure = list(map(int, input().strip().split()))
        ob=Solution()
        print(ob.minimumPlatform(n,arrival,departure))
# } Driver Code Ends