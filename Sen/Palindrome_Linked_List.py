# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def isPalindrome(self, head): # space: O(1)
        """
        :type head: ListNode
        :rtype: bool
        """
        if not head:
            return True
        fast, slow = head.next, head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        second = slow.next 
        slow.next = None # split the linked list into two parts

        node = None # reverse the second part
        while second:
            nxt = second.next
            second.next = node
            node = second
            second = nxt 

        while node: # compare two parts, second part has the same or one less node 
            if node.val != head.val:
                return False
            node = node.next
            head = head.next
        return True   



    # def isPalindrome(self, head): # 
    #     if not head:
    #         return True
    #     lst = list()
        
    #     i = head
    #     while i:
    #         lst.append(i.val)
    #         i = i.next
    #     if len(lst) == 1:
    #         return True
    #     mid = len(lst) / 2
    #     i, j = 0, len(lst) - 1
    #     for i in range(0, mid + 1):
    #         if lst[i] != lst[j]:
    #             return False
    #         j -= 1
    #     return True

    # def isPalindrome(self, head): # space: n 
    #     if not head:
    #         return True
    #     lst1 = list()
    #     lst2 = list()
    #     i = head
    #     while i:
    #         lst1.append(i.val)
    #         i = i.next
    #     if len(lst1) == 1:
    #         return True
    #     mid = len(lst1) / 2
    #     if len(lst1) % 2 == 0:
    #         for i in range(len(lst1) - 1, mid - 1, -1):
    #             lst2.append(lst1.pop())
    #         return lst1 == lst2
    #     else:
    #         for i in range(len(lst1) - 1, mid - 1, -1):
    #             lst2.append(lst1.pop())
    #         lst2.pop()    
    #         return lst1 == lst2  

# n0 = ListNode("a")
# head = n0
# n1 = ListNode("b")
# n2 = ListNode("a")
# n0.next = n1
# n1.next = n2
# print n0.val, n0.next.val, n0.next.next.val

n0 = ListNode("a")
head = n0
n1 = ListNode("b")
n2 = ListNode("b")
n3 = ListNode("a")
n0.next = n1
n1.next = n2
n2.next = n3

print n0.val, n0.next.val, n0.next.next.val, n0.next.next.next.val

i = Solution()
print i.isPalindrome(head)