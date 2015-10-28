# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def swapPairs(self, head): 
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head
        dummy = ListNode(0); dummy.next = head
        p = dummy
        while p.next and p.next.next:
            tmp = p.next.next
            p.next.next = tmp.next
            tmp.next = p.next 
            p.next = tmp # move the dummy node to tmp instead of moving head
            p = p.next.next
        return dummy.next # return dummy.next instead of head

    # def swapPairs(self, head): 
        
        # if not head:
        #     return 
        # if not head.next:
        #     return head
            
        # d1 = ListNode(0)
        # pre = d1
        # d1.next = head
        
        # cur = None
        # d2 = ListNode(1)
        # cnt = d2
        # cnt.next = head
        
        # while cnt.next:
        #     if head.next == cur:
                
        #     if cnt.val == 2:
                
        #         cur = cnt.next
        #         if head.next == cur: # update head one time 
        #             head = cur
        #         cnt.next = cnt.next.next
        #         cnt.val = 1 # move counter 
                
        #         pre.next.next = cur.next
        #         cur.next = pre.next
                
        #         if head.next != cur:
                    
        #             pre.next = cur 
        #         pre = pre.next
                
        #     else:
        #         cnt.next = cnt.next.next
        #         cnt.val = 2 # move counter 
                
        # return head
                
        
        