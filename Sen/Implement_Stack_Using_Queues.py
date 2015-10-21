import collections
class Stack(object):
    def __init__(self):
        self.queue = collections.deque()

    def push(self, x):
        self.queue.append(x) # add the new item into the tail of queue
        for i in range(len(self.queue) - 1): # move other items hehide the new one by one
            self.queue.append(self.queue.popleft())
        print self.queue

    def pop(self):
        return self.queue.popleft()

    def top(self):
        return self.queue[0]

    def empty(self):
        return len(self.queue) == 0

    # def __init__(self): # two queues
    #     """
    #     initialize your data structure here.
    #     """
    #     self.length = 0
    #     self.queue1 = []
    #     self.queue2 = []

    # def push(self, x):
    #     """
    #     :type x: int
    #     :rtype: nothing
    #     """
    #     self.queue1.append(x)
    #     self.length += 1

    # def pop(self):
    #     """
    #     :rtype: nothing
    #     """
    #     if self.length >= 1:
    #         for i in range(self.length - 1):
    #             self.queue2.append(self.queue1.pop(0))
    #         self.queue1 = self.queue2
    #         self.length -= 1

    # def top(self):
    #     """
    #     :rtype: int
    #     """ 
    #     if self.length >= 1:
    #         for i in range(self.length - 1):
    #             self.queue2.append(self.queue1.pop(0))   
    #         top = self.queue1.pop(0)
    #         self.queue2.append(top)
    #         self.queue1 = list(self.queue2) # shallow copy
    #         # self.queue1 = self.queue2 # wrong, deep copy
    #         self.queue2 = []
    #         return top 

    # def empty(self):
    #     """
    #     :rtype: bool
    #     """
    #     if self.length == 0:
    #         return True
    #     return False 

i = Stack()
i.push(1)
i.push(2)
i.push(3)
print i.top()
print i.top()