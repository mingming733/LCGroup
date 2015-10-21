class Queue(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack1 = []
        self.stack2 = []

    def adjust(self):
        if len(self.stack2) == 0:
            while len(self.stack1) != 0:
                self.stack2.append(self.stack1.pop())

    def push(self, x):
        """
        :type x: int
        :rtype: nothing
        """
        self.stack1.append(x)

    def pop(self):
        """
        :rtype: nothing
        """
        self.adjust()
        return self.stack2.pop()

    def peek(self):
        """
        :rtype: int
        """
        self.adjust()
        return self.stack2[len(self.stack2) - 1]

    def empty(self):
        """
        :rtype: bool
        """
        if not len(self.stack1) and not len(self.stack2):
            return True
        else:
            return False
    
q = Queue()
print q.empty()
q.push(1)
q.push(2)
q.push(3)
print q.empty()

print q.peek()
print q.printQueue()



