class Queue:

    def __init__(self):
        self.stack1 = []
        self.stack2 = []
        
    def push(self, element):
        # write your code here
        self.stack1.append(element)

    def top(self):
        # write your code here
        if len(self.stack2)<1:
            while len(self.stack1)>0:
                self.stack2.append(self.stack1.pop())
        return self.stack2[-1]
    def pop(self):
        # write your code here
        # pop and return the top element
        ele = self.top()
        self.stack2.pop()
        return ele