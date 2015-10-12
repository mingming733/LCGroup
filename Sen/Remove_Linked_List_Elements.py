# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        dummy = ListNode(0)
        pre = dummy
        pre.next = head
        
        cur = head
        while cur:
            if cur.val == val:
                # cur = cur.next 
                pre.next = pre.next.next
            else:
                # cur = cur.next
                pre = pre.next 
            cur = cur.next 
        head = dummy.next 
        return head