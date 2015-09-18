# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        start = ListNode(0)
        slow = start
        fast = start 
        slow.next = head 
        for i in range(1, n + 2): # move fast in front so that the gap between fast and slow becomes n
        	fast = fast.next
        while fast: # move fast to the end, maintaining the gap
        	slow = slow.next
        	fast = fast.next
        slow.next = slow.next.next # skip the desired node
        return start.next
