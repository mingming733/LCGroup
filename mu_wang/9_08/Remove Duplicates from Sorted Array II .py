class Solution(object):
    def removeDuplicates(self, A):
        """
        :type nums: List[int]
        :rtype: int
        """
        i,j=0,0
        if len(A)<1:
            return 0
        A[i]=A[j]
        j+=1
        count=1
        while j< len(A):
            if A[i]==A[j]:
                if count!=2:
                    i+=1
                    A[i]=A[j]
                    count+=1
            else:
                i+=1
                A[i]=A[j]
                count =1
            j+=1
        return i+1
                    
        

        