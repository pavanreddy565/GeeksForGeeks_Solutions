
from typing import List


class Solution:
    def isPrime(self,n):
        if n<2:
            return False
        for i in range(2,int(n**0.5)+1):
            if n%i==0:
                return False
        return True
    def getPrimes(self, n : int) -> List[int]:
        # code here
        if n<4:
            return [-1,-1]
        
        for i in range(1,int(n/2)+1):
            if self.isPrime(i) and self.isPrime(n-i):
                return [i,n-i]
        return [-1,-1]



#{ 
 # Driver Code Starts
class IntArray:

    def __init__(self) -> None:
        pass

    def Input(self, n):
        arr = [int(i) for i in input().strip().split()]  #array input
        return arr

    def Print(self, arr):
        for i in arr:
            print(i, end=" ")
        print()


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        obj = Solution()
        res = obj.getPrimes(n)

        IntArray().Print(res)

# } Driver Code Ends