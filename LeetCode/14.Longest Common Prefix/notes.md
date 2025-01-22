We are given that the input is an array of strings

We first set the prefix variable to the first string in the array.  We do this since it is the starting string.  It will change once it is compared to the next

for each string in strs[1:] says: for strings in the array strs starting from the first index
    While the prefix is not equal to the current string from the 0 index to the prefix length, then decrease the prefix length by 1.  If the prefix length is 0, then return ""
    then set the prefix equal to the set prefix from [0:prefixlength] the first character to the character at the length of the prefix
