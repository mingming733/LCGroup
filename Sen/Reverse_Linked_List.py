# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head): # iterative 
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev = None # initialize the pointer prev as None, then points to the first node in the resultant linked list
        while head:
        	curr = head # curr points to the first node in the linked list
        	head = head.next
        	curr.next = prev
        	prev = curr
        return prev 

    def reverseList(self, head): # recursive 
    	return self.reverse(head)
    def reverse(self, node, prev = None):
    	if not node:
    		return prev
    	n = node.next
    	node.next = prev
    	return self.reverse(n, node)


