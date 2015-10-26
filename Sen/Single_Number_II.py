class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rst = 0
        for i in range(32):
        	cnt = 0
        	for n in nums:
        		if (n >> i) & 1:
        			cnt += 1
        	rst |= (cnt % 3) << i 
        # return format(rst if rst >= 0 else (1 << 32) + rst, "032b")
        print rst 
        return self.convert(rst) 

    def convert(self, x):
        if x >= 2 ** 31: # negative number 
            x -= 2 ** 32s
        return x
# # 001 | 010 = 011; 
# # 001 & 1 = 1, 010 & 1 = 0; 
# # 3 & 3 = 3;

    # def singleNumber(self, A):
    #     # Numbers in A are 32-bit integers in C format, most significant bit == 0 means positive, 1 means negative.
    #     # Positive numbers are easy to handle.
    #     # For negative numbers, they are represented as complement , e.g.  x= -12345, 
    #     # bit[31] is 1, bit[30] ~ bit[0] are 11...11(31 bits) - (-x) + 1, let y = 11...11 - (-x) + 1  
    #     bit = [0 for i in xrange(32)]
    #     # bit[0] is the least significant bit, bit[0]
    #     for number in A:
    #         for i in xrange(32):
    #             if (1 << i) & number == 1 << i: bit[i] += 1
    #     print bit 
    #     res = 0
    #     if bit[31] % 3 == 0: # target number is positive
    #         for i in xrange(31):
    #             if bit[i] % 3 == 1: res += 1 << i
    #     else: # target number is negative
    #         for i in xrange(31):
    #             if bit[i] % 3 == 0: res += 1 << i # now res = 11..11 - y
    #         res = -(res + 1) # now res = -(11..11 - y + 1) = x
    #     return res

nums = [1, 1, 1, -2]
i = Solution()
print i.singleNumber(nums)

