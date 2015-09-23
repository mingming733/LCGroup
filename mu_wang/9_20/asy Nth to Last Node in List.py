"""
Definition of ListNode
class ListNode(object):

    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""
class ListNode(object):

    def __init__(self, val, next=None):
        self.val = val
        self.next = next

class Solution:
    """
    @param head: The first node of linked list.
    @param n: An integer.
    @return: Nth to last node of a singly linked list. 
    """
    def nthToLast(self, head, n):
        # write your code here
        
        length = 0 
        store_head = head
        while head:
            length += 1
            head = head.next
        
        count = 0
        head = store_head
        while head :
            count +=1
            if count == length - n+1:
                return head.val
            head = head.next

a = ListNode(3)
a.next = ListNode(2)
a.next.next = ListNode(1)
a.next.next.next = ListNode(5)

b = Solution()

print b.nthToLast(a,2)