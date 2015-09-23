class MinStack(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack =[]
        self.min_num = None

    def push(self, x):
        """
        :type x: int
        :rtype: nothing
        """
        if not self.min_num or len(self.stack)<1:
            self.min_num = x
        else:
            self.min_num = min(self.min_num,x)
        self.stack.append(x)

    def pop(self):
        """
        :rtype: nothing
        """
        if len(self.stack)>0:
            a = self.stack.pop()
        if a ==self.min_num and len(self.stack)>0 :
            self.min_num = min(self.stack)
    def top(self):
        """
        :rtype: int
        """
        if len(self.stack)>0:
            return self.stack[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        # rst = self.stack[-1]
        # for i in self.stack:
        #     rst = min(rst,i)
        return self.min_num
        