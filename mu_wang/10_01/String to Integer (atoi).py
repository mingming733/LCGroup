class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        rst = ""
        str = str.strip()
        if len(str)>0 and (str[0]=="-" or str[0] =="+"):
            rst +=str[0]
            str =str[1:]
   
        for i in range(0,len(str)):
            if str[i].isdigit():
                rst+=str[i]
            else:
                break
        try:
            if int(rst)>2147483647:
                return 2147483647
            if int(rst)<-2147483648:
                return -2147483648
            return int(rst)
        except:
            return 0
        
            
        