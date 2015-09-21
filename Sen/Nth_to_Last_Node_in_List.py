"""
Definition of ListNode
class ListNode(object):

    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""
class Solution:
    """
    @param head: The first node of linked list.
    @param n: An integer.
    @return: Nth to last node of a singly linked list. 
    """
    def nthToLast(self, head, n):
        # write your code here
        start = ListNode(0)
        slow = start
        fast = start 
        slow.next = head
        for i in range(1, n + 2):
            fast = fast.next
        while fast:
            fast = fast.next
            slow = slow.next
        return slow.next
