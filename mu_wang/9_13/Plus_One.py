class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        result = list()
        new_list = "".join(str(x) for x in digits)
        new_val = int(new_list)+1
        result = result + [ int(x) for x in str(new_val)]
        return result