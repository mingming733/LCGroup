class MinStack:
    # initialize your data structure here.
    def __init__(self):
        self.S = []
        self.minS = []

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.S.append(x)
        if self.minS == []:
            self.minS.append(x)
        else:
            if self.minS[-1] >= x:
                self.minS.append(x)

    # @return nothing
    def pop(self):
        top = self.S.pop()
        if self.minS[-1] == top:
            self.minS.pop()

    # @return an integer
    def top(self):
        return self.S[-1]

    # @return an integer
    def getMin(self):
        return self.minS[-1]