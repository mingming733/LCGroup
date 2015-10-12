# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        if not node or not node.next:
            return
        
        node.val = node.next.val
        node.next = node.next.next

        

n0 = ListNode(0)
n1 = ListNode(1)
n0.next = n1
print n0.val, n0.next.val, n0.next.next

i = Solution()
i.deleteNode(n0)


print n0.val, n1.next
