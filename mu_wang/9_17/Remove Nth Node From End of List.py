# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        length = 0
        rst = head
        while rst:
            rst = rst.next
            length += 1     #count how long the linked list is
        if length ==1:
            return 
        a = 0   #find current location
        temp = head
        if length == n:   # if length equals n, then remove first
            temp=head.next
        else:
            while a < length-n-1:  
                a +=1
                head = head.next
            head.next = head.next.next
        return temp