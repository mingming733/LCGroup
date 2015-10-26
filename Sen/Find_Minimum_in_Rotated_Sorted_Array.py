class Solution(object):
	def findMin(self, nums):
		low, high = 0, len(nums) - 1
		while low < high:
			if nums[low] < nums[high]:
				return nums[low]
			mid = low + (high - low) / 2
			# if nums[mid] < nums[high]:
			# 	high = mid
			# else:
			# 	low = mid + 1
			if nums[mid] >= nums[low]:
				low = mid + 1
				print mid, low, high
			else:
				high = mid
				print mid, low, high
		return nums[low]


# nums = [4, 5, 6, 7, 1, 2, 3]
# nums = [7, 1, 2, 3]
nums = [7, 1]
i = Solution()
print i.findMin(nums)
