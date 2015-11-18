class Solution(object):
    # def search(self, nums, target):
    #     """
    #     :type nums: List[int]
    #     :type target: int
    #     :rtype: bool
    #     """
    #     if not nums:
    #         return -1
    #     left, right = 0, len(nums) - 1

    #     while left <= right: # including the situation 1, only two items left, left and mid point to the first one and right points the second one, but the second one is our target, we need to execute while loop one more time to find the target. 
    #         mid = left +  (right - left) / 2
    #         if target == nums[mid]:
    #             return True
    #         # to move both left and right boundaries until they are not equal to mid; 
    #         while nums[mid] == nums[right] and mid != right:
    #             right -= 1
    #         while nums[mid] == nums[left] and mid != left:
    #             left += 1

    #         if nums[mid] >= nums[left]: # beside the situation 1, we need to handle the situation with the only only item left.
    #             if target < nums[mid] and target >= nums[left]:
    #                 right = mid - 1
    #             else:
    #                 left = mid + 1
    #         elif nums[mid] < nums[right]: 
    #             if target > nums[mid] and target <= nums[right]:
    #                 left = mid + 1
    #             else:
    #                 right = mid - 1
    #     return False 

        def search(self, A, target):
            left=0; right=len(A)-1
            while left<=right:
                mid=(left+right)/2
                if A[mid]==target: return True
                if A[left]==A[mid]==A[right]:
                    left+=1; right-=1
                elif A[left]<=A[mid]:
                    if A[left]<=target<A[mid]: right=mid-1
                    else: left=mid+1
                else:
                    if A[mid]<=target<A[left]: left=mid+1
                    else:right=mid-1
            return False

nums = [1, 1, 1, 1, 3, 1, 1]
target = 3
i = Solution()
print i.search(nums, target)