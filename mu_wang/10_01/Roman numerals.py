Roman numerals.py
"""
I placed before V or X indicates one less, so four is IV (one less than five) and nine is IX (one less than ten)
X placed before L or C indicates ten less, so forty is XL (ten less than fifty) and ninety is XC (ten less than a hundred)
C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is 
CM (a hundred less than a thousand)[5]"""

"""1954 as MCMLIV"""
"""1990 as MCMXC"""
"""2014 as MMXIV"""

class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        stack  = []
        
        if s =="":
            return 0

        for i in s:
            stack.append(i)

        last = stack.pop()
        while len(stack)>0:
            temp = stack.pop()
            if 


