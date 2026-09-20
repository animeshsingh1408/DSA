class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        min,smin=102,101
        for i in prices:
            if i<min:
                smin=min
                min=i
            elif i<smin:
                smin=i
        s=min+smin
        if money-s>=0:
            return money-s
        return money
        