def minMeetingRooms(self, intervals: List[List[int]]) -> int:
    start = sorted(i[0] for i in intervals)
    end = sorted(i[1] for i in intervals)

    e, s = 0, 0
    count = 0

    while (s < len(intervals)):
        if (start[s] < end[s]):
            s += 1
            count += 1
        else:
            e += 1
            count -= 1

    return count
