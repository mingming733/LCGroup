class Solution(object):
    def removeDuplicates(self, A):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        j = 0
        if len(A) <1:
            return 0
        A[i]=A[j]
        j+=1
        while j < len(A):
            if A[j]!= A[i]:
                i+=1
                A[i] = A[j]
            j+=1
        return i+1

        