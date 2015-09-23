class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        dic = {"]": "[", "}": "{", ")": "("}
        for char in s:
        	if char in dic.values():
        		stack.append(char)
        	elif char in dic.keys():
        		if stack == [] or dic[char] != stack.pop()
        			return False
        	else:
        		return False
        return stack == []

    def isValid(self, s):
    	stack = []
    	for i in range(len(s)):
    		if s[i] == '(' or s[i] == '[' or s[i] == '{':
    			stack.append(s[i])
    		if s[i] == ')':
				if stack == [] or stack.pop() != '(':
					return False
			if s[i] == ']':
				if stack == [] or stack.pop() != '[':
					return False
			if s[i] == '}':
				if stack == [] or stack.pop() != '{':
					return False
		if stack: # check if stack is not empty after iteration
			return False
		else:
			return True 



