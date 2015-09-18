class Solution:
    # @param s: a string
    # @return: a boolean
    def isUnique(self, str):
        # write your code here
        count = dict()
        for i in str:
            count[i] = count.get(i,0)+1
        for a in count:
            if count[a]>1:
                return False
        return True


    def isUnique_2(self, str):
        # write your code here
        for i in range(0,len(str)):
            for a in range(i+1,len(str)):
                if str[i]==str[a]:
                    return False
        return True