"""
Definition of ListNode
class ListNode(object):

    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""
class Solution:
    # @param node: the node in the list should be deleted
    # @return: nothing
    def deleteNode(self, node): # only have access to the node which need to be deleted. so just 'swap' its value with its next one's value, and then delete its next one. 
        # write your code here
        if not node.next:
            return
        node.val = node.next.val
        node.next = node.next.next