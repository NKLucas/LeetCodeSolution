class Solution(object):
    def maxArea(self, heights):
        """
        :type height: List[int]
        :rtype: int
        """
        # 递增站不能用在这一题上。我写了出来，但是不对。［4，2，3］
        # This problem is very tricky. I think long time to figure out.
        # http://www.cnblogs.com/TenosDoIt/p/3812880.html
        length = len(heights)
        left = 0
        right = length - 1
        maxarea = 0
        while left < right:
            temp = (right - left) * min(heights[left], heights[right])
            maxarea = max(temp, maxarea)
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        return maxarea

