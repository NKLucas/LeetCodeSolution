class Solution(object):
    def bulbSwitch(self, n):
        """
        :type n: int
        :rtype: int
        """
        # 就是是一个数的平方会亮着，其他都被灭了！
        import math
        x = math.floor(math.sqrt(n))
        return int(x)
        