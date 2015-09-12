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
        if len(intervals)<1:
            return list()
        result = list()
        intervals = sorted(intervals,key=lambda x: x.start)
        result.append(intervals[0])
        for i in range(1,len(intervals)):
            last = result.pop()
            cur = intervals[i]
            if cur.start>last.end:
                result.append(last)
                result.append(cur)
                continue
            if last.start <= cur.start and cur.end <= last.end :
                result.append(last)
                continue
            if last.start<=cur.start<=last.end and cur.end>last.end:
                last.end = cur.end
            if cur.start< last.start and cur.end>=last.end:
                last.start = cur.start
                last.end = cur.end
            result.append(last)
           
        return result
                