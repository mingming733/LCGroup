class Queue:

    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def adjust(self):
        if len(self.stack2) == 0:
            while len(self.stack1) != 0:
                self.stack2.append(self.stack1.pop())

    def push(self, element):
        # write your code here
        self.stack1.append(element)

    def top(self):
        # write your code here
        # return the top element
        self.adjust()
        return self.stack2[len(self.stack2) - 1]

    def pop(self):
        # write your code here
        # pop and return the top element
        self.adjust()
        return self.stack2.pop()


