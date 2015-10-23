# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if not head or not head.next:
            return False
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                return True
        return False

    # def hasCycle(self, head): # wrong 
    #     """
    #     :type head: ListNode
    #     :rtype: bool
    #     """
    #     if not head or not head.next:
    #         return False
    #     dummy = ListNode(0)
    #     d = dummy
    #     fast = head
    #     slow = d
    #     while fast.next or fast.next.next:
    #         if fast = slow:
    #             return True
    #         slow = slow.next
    #         fast = fast.next.next
    #     return False