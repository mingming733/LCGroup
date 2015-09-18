# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2): # iterative, non-in-place 
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1:
        	return l2
        if not l2:
        	return l1
        dummy = ListNode(0) # creat a dummy node as the head of a new linked list
        tmp = dummy # tmp points to the last node in the new linked list
        while l1 and l2:
        	if l1.val <= l2.val:
        		tmp.next = l1
        		l1 = l1.next
        		tmp = tmp.next
        	else:
        		tmp.next = l2
        		l2 = l2.next
        		tmp = tmp.next
        if not l2:
        	tmp.next = l1
        else:
        	tmp.next = l2
        return dummy.next

    def mergeTwoLists(self, l1, l2): # iterative, in place
        if None in (l1, l2): 
            return l1 or l2 # return non-None value 
        dummy = cur = ListNode(0)
        dummy.next = l1
        while l1 and l2:
            if l1.val < l2.val:
                l1 = l1.next
            else:
                nxt = cur.next
                cur.next = l2
                tmp = l2.next
                l2.next = nxt
                l2 = tmp
            cur = cur.next
        cur.next = l1 or l2
        return dummy.next

    def mergeTwoLists(self, l1, l2): # recursive, tail call
    	if not l1: 
    		return l2
    	if not l2:
    		return l1
    	if l1.val < l2.val:
    		l1.next = self.mergeTwoLists(l1.next, l2)
			return l1
		else:
			l2.next = self.mergeTwoLists(l1, l2.next)
			return l2





