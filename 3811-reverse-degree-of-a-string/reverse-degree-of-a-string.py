class Solution:
    def reverseDegree(self, s: str) -> int:
        ans=0
        j=1
        for i in range(len(s)):
            p=ord(s[i])
            p=123-p
            p=p*j
            j+=1
            ans+=p
        return ans
        