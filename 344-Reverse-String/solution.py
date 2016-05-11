class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        s_list = list(s)
        s_list.reverse()
        result = ''.join(s_list)
        return result