#User function Template for python3

class Solution:
    def mergeNsort(self, a, b, n, m, answer):
        # Write your code here
        ans=list(set(a).union(set(b)))
        ans.sort()
        for i in range(len(ans)):
            answer[i]=ans[i]
        # print(ans)
        return len(ans)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        m = int(input())
        b = [int(x) for x in input().strip().split()]
        ob=Solution()
        answer = [0 for i in range(n+m+5)]
        k = ob.mergeNsort(a, b, n, m, answer)
        for i in range(0,k):
            print(answer[i], end=" ")
        print()

        T -= 1


if __name__ == "__main__":
    main()





# } Driver Code Ends