# Definition for an interval.
# class Interval(object):
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        # if not intervals:
        # 	return []
        rst = []
        for i in sorted(intervals, key = lambda i: i.start):
        	if rst and i.start <= rst[-1].end: 
        		rst[-1].end = max(rst[-1].end, i.end)
        	else:
        		rst += i, # rst.append() it is a tuple iterator 
        return rst 

    def merge(self, intervals):
    	intervals.sort(key = lambda x: x.start)
    	rst = intervals[:1] # in case there is only one item in intervals
    	for i in intervals[1:]:
    		if i.start <= rst[-1].end:
    			rst[-1].end = max(rst[-1].end, i.end)
    		else:
    			rst.append(i)
    	return rst

    # wrong 
    # def merge(self, intervals): # in place???
    #     """
    #     :type intervals: List[Interval]
    #     :rtype: List[Interval]
    #     """
    #     n = len(intervals)
    #     if n == 0:
    #         return []
    #     if n == 1:
    #         return intervals
    #     intervals.sort()
        
    #     lst = []
    #     for i in range(1, n):
    #         if intervals[i].start <= intervals[i - 1].end:
    #             lst.append([intervals[i - 1].start, intervals[i].end])
    #         elif i == 1:
    #             lst.append(intervals[i])
    #             lst.append(intervals[i - 1])
    #         else:
    #             lst.append(intervals[i])
    #     return lst

intervals = []
instance = Solution()
print instance.merge(intervals)