# Java code is having issues.
class Solution:
    def insertInterval(self, intervals, newInterval):
        # Code here
        intervals.append(newInterval)
        intervals.sort(key = lambda x : x[0])
        res = []
        res.append(intervals[0])
        n = len(intervals)
        
        for i in range(1, n):
            if res[-1][1] >= intervals[i][0]:
                res[-1] = [min(res[-1][0],intervals[i][0]),max(res[-1][1],intervals[i][1])]
            else:
                res.append(intervals[i])
        return res