class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        prefixlength = len(prefix)

        for string in strs[1:]:
            while prefix != string[0:prefixlength]:
                prefixlength -= 1
                if prefixlength == 0:
                    return ""
                
                prefix = prefix[0:prefixlength]

        return prefix
