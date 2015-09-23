# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        node1 = ListNode(0)
        node2 = ListNode(0)
        p1, p2 = node1, node2

        while head:
        	if head.val < x:
        		p1 = p1.next = head # ???
        	else:
        		p2 = p2.next = head
        	head = head.next
        p2.next = None # 断开尾巴 防止循环
        p1.next = node2.next
        return node1.next 

    def partition(self, head, x):
    	qLess = []
        qOther = []
        
        i = head
        while i:
            if i.val < x:
                qLess.append(i.val)
            else:
                qOther.append(i.val)
            i = i.next
            
        q = qLess + qOther
        
        n = len(q)
        i = head
        while i and n != 0:
            newVal = q.pop(0)
            i.val = newVal
            i = i.next
            n -= 1
          
        return head
