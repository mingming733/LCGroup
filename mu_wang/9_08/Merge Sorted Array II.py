class Solution:
    #@param A and B: sorted integer array A and B.
    #@return: A new sorted integer array
    def mergeSortedArray(self, A, B):
        # write your code here

        a = len(A) -1 
        b = len(B) -1 
        c = list()
        i,j=0,0
        while i<=a and j <= b :
            if A[i]<= B[j]:
                c.append(A[i])
                i+=1
            else:
                c.append(B[j])
                j+=1
        while i<=a:
            c.append(A[i])
            i+=1
        while j<=b:
            c.append(B[j])
            j+=1
        return c
            
            
        
