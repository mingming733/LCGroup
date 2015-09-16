class Solution(object): 
#     def plusOne(self, digits):
#         for i in range(len(digits) - 1, -1, -1):
#             if digits[i] < 9:
#                 digits[i] += 1
#                 return digits
#             else:
#                 digits[i] = 0
#         digits.insert(0, 1) 
#         return digits
# # plus one means add up all digits, then add one to result, insert the result to the first place in the list
        

# digits = [10, 10]
# i = Solution()
# print i.plusOne(digits)

    # def plusOne(self, digits):
    #     """
    #     :type digits: List[int]
    #     :rtype: List[int]
    #     """
    #     result = list()
    #     new_list = "".join(str(x) for x in digits)
    #     new_val = int(new_list)+1
    #     result = result + [ int(x) for x in str(new_val)]
    #     return result



   def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        rpt = 0
        n = len(digits)
        for i in digits:
            n -= 1
            rpt += i * (10 ** n) 
        rpt += 1
        return [int(i) for i in str(rpt)]

digits = [1, 3, 5] * 10000000
i = Solution()
print i.plusOne(digits)
    

    # def plusOne(self, digits):    
    #     num = 0
    #     for i in range(len(digits)):
    #         num += digits[i] * pow(10, (len(digits)-1-i))
    #     return [int(i) for i in str(num+1)]
        