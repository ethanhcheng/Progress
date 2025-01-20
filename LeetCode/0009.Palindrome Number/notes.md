# This implementation can still be improved.  Only beats 6.05% on LeetCode
Goal is to find out if a given number is a palindrome.  Output is true or false
Palindrome number is same as original when reversed
For instance 121
This code uses the modulus operator to create a reverse of the given number.  The reversed number is then compared to the original number to see if they are the same number.  If they are the same number, then the number is a palindrome.
The reverse function uses the modulus operator %10 to get the value of the last digit in the given number.  The result variable is then multiplied by 10 to make space in the ones spot for the new entry.  The original number is divided by 10 to account for the modulus operator finding the digit and applying it to the result variable. Applying it to the result variable starts the creation of the reversed number.
A negative number can not be a palindrome so if the number is less than 0, false is returned.  The original value is then compared to the reversed one.  If they are the same, true is returned.  If they are not the same then false is returned.  

