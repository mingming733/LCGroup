# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next: # check if there is only one node or no node in the linked list
        	return head
        i = head
        while i.next: # iterate until there is only one node left
        	if i.val == i.next.val: # the nodes with same value exist together, so they could be deleted one by one
        		i.next = i.next.next
        	else:
        		i = i.next
        return head