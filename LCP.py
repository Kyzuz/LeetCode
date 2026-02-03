class Solution(object):
    def longestCommonPrefix(self, strs):        
        
        if len(strs) == 0:      # S'il n'y a aucun mot
            return ""
        
        prefix = strs[0]
        for i in range(1, len(strs)):
            while strs[i].find(prefix) != 0:
                prefix = prefix[0 : len(prefix) - 1]
                if prefix == "":
                    return ""
        return prefix
    
if __name__ == "__main__":
    sol = Solution()
    sol.longestCommonPrefix(["flower","florida","flounk","flod"])    