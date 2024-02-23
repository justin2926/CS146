def threeSum(self, nums: List[int]) -> List[List[int]]:
    n=set()
    n.sort()
    z=len(nums)
    for i in range(z-2):
        for j in range(i+1,z-1):
            for k in range(j+1,z):
                if nums[i]+nums[j]+nums[k]==0:
                    n.add((nums[i],nums[j],nums[k]))
    return n
