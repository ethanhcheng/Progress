Goal is to take input of 2D array, sum up the values of each array within the array and output the greatest sum.
This can be done by 2 looping through all the rows and columns.  First we loop through each index i.  Each index i is an array so we can loop through each index in each of the arrays.  This is the for loop for int j.  We then store this value in a variable sum.  After each sub array is one summing, then it is referenced with a max value.  If the sum is larger than the max value, the max value is replaced with the sum. 
For instance:
[[1, 2, 3], [3, 2, 1]]
The first for loop finds the first array at index 0.  This is [1, 2, 3]
A new for loop looping through this sub array finds the sum of this array and the value of sum is replaced with the sum of the array.
The value in sum is then compared to the max value.  The larger value is stored in max.
The original for loop then finds the next sub array at index 1.  This is [3, 2, 1]
Then a new for loop is used again to loop through this ub array and find the sum.
Like the previous array, this sum is compared to the value in max and the larger value is stored in the max variable.
Once there are no more sub arrays to find in the given input array, the for loop ends and the max value is returned.

