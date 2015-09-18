# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        cur =ListNode(0)
        head = None
        flag = True
        while l1 and l2:
            if l1.val<=l2.val:
                cur.next = ListNode(l1.val)
                if flag:
                    head = cur.next
                    flag = False
                cur = cur.next
                l1 = l1.next
            else:
                cur.next = ListNode(l2.val)
                if flag:
                    head = cur.next
                    flag = False
                cur = cur.next
                l2 = l2.next
        while l1:
            cur.next = ListNode(l1.val)
            if flag:
                head = cur.next
                flag = False
            cur = cur.next
            l1 = l1.next
        while l2:
            cur.next = ListNode(l2.val)
            if flag:
                head = cur.next
                flag = False
            cur = cur.next 
            l2 = l2.next
        return head
        