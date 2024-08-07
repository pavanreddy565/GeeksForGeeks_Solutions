#User function template for Python

class Solution:
    # your task is to complete this function
    # function should return an integer
    def atoi(self,s):
        # Code here
        ans=''
        n=len(s)
        i=0
        pos=[]
        if n==0:
            return 0
        

        while i<n and s[i]==' ' :
            i+=1
        while i<n and not s[i].isdigit() :
            if s[i]=='-' or s[i]=='+':
                pos.append(s[i])
            if s[i].isalpha() or s[i] not in ['-','+'] or (s[i] in ['-','+'] and len(pos)>1 ):
                return -1
            i+=1
        
        while i<n :
            if not s[i].isdigit():
                return -1
            if not  (s[i]=='0' and len(ans)==0):
                ans+=s[i]
            i+=1
        if len(ans)==0:
            return 0
        if len(pos)==1:
            ans=pos[0]+ans
        ans=eval(ans)
        if ans>(2**31)-1:
            return (2**31)-1
        elif ans<-2**31:
            return -2**31
        return ans



#{ 
 # Driver Code Starts
#Initial template for Python

if __name__=='__main__':
    t=int(input())
    for i in range(t):
        string = input().strip();
        ob=Solution()
        print(ob.atoi(string))
# } Driver Code Ends