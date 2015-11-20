# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head): # extra space: O(n)
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return None
        dic = {}
        while head:
            if head in dic:
                return head
            dic[head] = 0
            head = head.next
        return None

    def detectCycle(self, head): 
        if not head or not head.next:
            return None
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow is fast:
                slow = head
                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        return None
