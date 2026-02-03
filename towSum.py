class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l = len(nums)
        i = 0
        y = 0
        for i in range(l):
            y = i
            for y in range(l):
                if i != y:
                    x1 = nums[i] + nums[y]
                    if x1 == target:
                        arr_out = [i,y] 
                        twoSum = arr_out
                        
                        

if __name__ == "__main__":
    sol = Solution()
    sol.twoSum([3,2,4], 6)