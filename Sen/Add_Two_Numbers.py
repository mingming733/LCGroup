# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        c1, c2 = l1, l2
        sentinel = ListNode(0)
        d = sentinel
        sum = 0

        while not c1 or not c2:
        	sum /= 10 
        	if not c1:
        		sum += c1.val
        		c1 = c1.next 
        	if not c2:
        		sum += c2.val
        		c2 = c2.next
        	d.next = 
        	d = d.next

        if sum / 10 == 1:
        	d.next = ListNode
