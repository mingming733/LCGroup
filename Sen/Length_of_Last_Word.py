class Solution:
    # @param {string} s
    # @return {integer}
    # def lengthOfLastWord(self, s):
    # 	s = s.split(" ")
    # 	print s
    #     for i in range(len(s) - 1, -1, -1):
    #         if s[i] != " " and s[i] != "":
    #             return len(s[i])
    #     return 0

    def lengthOfLastWord(self, s): 
        length, preLength = 0, 0 
        for letter in s:
            if letter == " ":
                if length != 0:
                    preLength = length
                    length = 0
                else: 
                    pass
            else:
                length += 1
        if length == 0: # there are multiple words 
            return preLength
        else:               
            return length # there is only one word and not whitespace behind it


s = " ab abc "
i = Solution()
print i.lengthOfLastWord(s)