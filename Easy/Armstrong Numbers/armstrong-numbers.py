#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        sum=0
        le=len(str(n))
        num=n
        while(n>0):
            rem=n%10
            sum+=(rem**le)
            n=n//10
        return "true" if sum==num else "false"
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = input()
        n = int(n)
        ob = Solution()
        print(ob.armstrongNumber(n))

# } Driver Code Ends