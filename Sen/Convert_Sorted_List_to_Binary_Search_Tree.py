# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # def sortedListToBST(self, head): # dummy node, root is not the listnode which slow pointer points to
    # #     """
    # #     :type head: ListNode
    # #     :rtype: TreeNode
    # #     """
    #     if not head:
    #         return 
    #     if not head.next:
    #         return TreeNode(head.val)
    #     dummy = ListNode(0)
    #     dummy.next = head
    #     slow, fast = dummy, head
    #     while fast and fast.next:
    #         slow = slow.next
    #         fast = fast.next.next
    #     root = TreeNode(slow.next.val)
    #     root.right = self.sortedListToBST(slow.next.next)
    #     slow.next = None
    #     root.left = self.sortedListToBST(head)
    #     return root 

    def sortedListToBST(self, head): # non-dummy node, the root is the listnode which slow pointer points to, so it have to deal with the corner case with only two list node
        if not head:
            return 
        if not head.next:
            return TreeNode(head.val)
        slow, fast = head, head
        
        if not slow.next.next: # only two list node left
            newHead = slow.next
            root = TreeNode(slow.val)
            root.right = self.sortedListToBST(newHead)
            return root
            
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        
       
        pre = head
        while pre.next != slow: 
            pre = pre.next
            
        newHead = slow.next # slice the linked list 
        pre.next = None
        
        root = TreeNode(slow.val)
        root.left = self.sortedListToBST(head)
        root.right = self.sortedListToBST(newHead)
        
        return root