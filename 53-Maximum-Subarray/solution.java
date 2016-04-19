class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        globalMax = nums[0]
        localMax = nums[0]
        for value in nums[1:]:
            if localMax < 0:
                localMax = 0
            localMax += value 
            if localMax > globalMax:
                globalMax = localMax
        return globalMax
        