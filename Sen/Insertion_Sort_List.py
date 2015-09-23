# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
        	return head

        helper = ListNode(0)
        cur = head
        pre = helper
        next = None

        while cur:
        	next = cur.next
        	while pre.next and pre.next.val < cur.val:
        		pre = pre.next
        	cur.next = pre.next
        	pre.next = cur
        	pre = helper 
        	cur = next 

        return helper.next 

    def insertionSortList(self, head):
    	newhead = ListNode(0)
    	newhead.next = head 
    	pre, cur = newhead, head
    	while cur:
    		if cur.next and cur.next.val < cur.val:
    			while pre.next and pre.next.val < cur.next.val:
    				pre = pre.next
    			tmp = pre.next
    			pre.next = cur.next
    			cur.next = cur.next.next
    			pre.next.next = tmp
    			pre = newhead
    		else:
    			cur = cur.next
    	return newhead.next



