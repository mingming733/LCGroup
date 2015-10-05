class Solution:
    # @param {string[]} strs
    # @return {string}
    # def longestCommonPrefix(self, strs):
    # 	if not strs:
    # 		return ""
    # 	s = strs[0]
    # 	rst = ""
    # 	for i in range(len(s)):
    # 		for j in range(1, len(strs)):
    # 			if i > len(strs[j]) - 1:
    # 				return rst 
    # 			if s[i] != strs[j][i]:
    # 				return rst 
    # 		rst += s[i]
    # 	return rst 

    def longestCommonPrefix(self, strs):
    	prefix = '';
    	# * is the unpacking operator, essential here
    	for z in zip(*strs): # zip() in conjunction with the * operator can be used to unzip a list
    		print "z:" + str(z) 
        	bag = set(z)
        	print "bag:" + str(bag)
        	if len(bag) == 1:
        		prefix += bag.pop()
        	else:
        		break
    	return prefix

    # def longestCommonPrefix(self, strs): wrong
    # 	if not strs:
    #         return ""
    #     if len(strs) == 1:
    #     	return strs[0]
    #     if not strs[0]:
    #     	return ""

    #     rstStr = ""
    #     minLen = len(strs[0])
    #     for i in range(len(strs)):
    #         curLen = len(strs[i])
    #         minLen = min(curLen, minLen) 
        
    #     for j in range(minLen):
    #         Letter = strs[0][j]
    #         for i in range(1, len(strs)):
    #             curLetter = strs[i][j]  
    #             print "curLetter:" + curLetter             
    #             if Letter != curLetter:
    #                 break            
    #         if i == len(strs) - 1 and len(strs[0]) != 1:
    #             rstStr += Letter            
    #     return rstStr

strs = ["ab", "abc", "abcd"]
# strs = [""]
# strs = ["a", "b"]
i = Solution()
print i.longestCommonPrefix(strs)