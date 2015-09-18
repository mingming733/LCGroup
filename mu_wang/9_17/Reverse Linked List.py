# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        new_head = ListNode(0)
        if not head:
            return 
        flag = True
        temp = list()
        while head:
            temp.append(ListNode(head.val))
            head = head.next
            if flag:
                flag = False
                continue
            else:
                temp[-1].next = temp[-2]
        new_head = temp[-1]
        return new_head

    def reverseList_2(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        new_head = ListNode(0)
        if not (head and head.next):
            return head
        rst =None
        pre = None
        next_ = None
        while head :
            if rst is None:
                rst = head
                next_ = head.next
                rst.next = pre
                pre = rst
            else:
                rst = head
                next_ = head.next
                rst.next = pre
                pre = rst
            head = next_
        return rst
