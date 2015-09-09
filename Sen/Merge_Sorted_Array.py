class Solution(object):
    def merge(self, A, m, B, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        # max = m - 1
        # crt = nums2[n - 1]
        # for i in range(max, -1, -1):
        # 	if crt < nums1[i] and crt > nums1[i - 1]:
        # 		max = i
        # 		n -= 1
        # 		crt = nums2[n - 1]

        l1, l2, end = m - 1, n - 1, m + n - 1
        while l1 >= 0 and l2 >= 0:
        	if nums2[l2] > nums1[l1]:
        		nums1[end] = nums2[l2] # supposed nums1 has enough space for m + n 
        		                       # IndexError: list assignment index out of range
        		l2 -= 1
        	else:
        		nums1[end] = nums1[l1]
        		l1 -= 1
        	end -= 1
        if l1 < 0:
        	nums1[:l2 + 1] = nums2[:l2 + 1]

nums1 = [2, 5, 6]
nums2 = [3, 7, 9]
m = 3
n = 2
test = Solution()
test.merge(nums1, 3, nums2, 2)
print nums1






