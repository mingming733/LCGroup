# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        value = list()
        while head:
            value.append(head.val)
            head = head.next
            
        return [ x for x in value] == [ x for x in reversed(value)]