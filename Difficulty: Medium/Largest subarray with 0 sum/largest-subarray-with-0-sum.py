#Your task is to complete this function
#Your should return the required output
class Solution:
    def maxLen(self, n, arr):
        #Code here
        maxi=0
        sumi=0
        mpp={}
        for i in range(n):
            sumi+=arr[i]
            if sumi==0:
                maxi=i+1
            else:
                if sumi in mpp:
                    maxi=max(maxi,i-mpp[sumi])
                else:
                    mpp.update({sumi:i})
        return maxi





#{ 
 # Driver Code Starts
if __name__=='__main__':
    t= int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.maxLen(n ,arr))
# Contributed by: Harshit Sidhwa
# } Driver Code Ends