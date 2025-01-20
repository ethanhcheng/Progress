We start with a for loop to loop through all the indexes of the array, but how do we create a running sum of the values at each index?
The return has to be an array with each index being a running sum from the previous index and the input array
For instance:
[1, 2, 3, 4] has an output of [1, 3, 6, 10]
This means that the retun has to be an array as well

We start with the 2nd index in the array (index 1) and add the previous index to it and replace the index with the sum.  We do this for the length of the array.  This means that 1 is added to 2 and the 2 is replaced with the sum with is 3.  That means the new output is [1, 3, 3, 4].  Then the next number in the input array is 3.  We take this and add the previous index which is now 3 which equals 6 and 6 takes the place of index 3.  This means that the array is now [1, 3, 6, 4].  We then move to the last index and add the previous index to it and replace the 4th index with the sum.  That means we have the fourth index, 4, and add the previous index, which has a value of 6, and we get a sum of 10.  This means the 4th index becomes 10.  We now have an array with values [1, 3, 6, 10]
