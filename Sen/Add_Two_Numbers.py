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

        while c1 or c2: # no matter if l1 and l2 have the same length
        	sum /= 10 # integer division, if last pass's sum is equal to or greater than 10, this pass's sum add 1
        	if c1:
        		sum += c1.val
        		c1 = c1.next 
        	if c2:
        		sum += c2.val
        		c2 = c2.next
        	d.next = ListNode(sum % 10)
        	d = d.next

        if sum / 10 == 1: # if the last pass's sum is equal to or greater than 10, create a new node with value 1
        	d.next = ListNode(1)

        return sentinel.next

