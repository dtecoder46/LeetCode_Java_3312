# LeetCode Java Problem #3312 - Sorted GCD (Greatest Common Divisor) Pair Queries
My solution to problem #3312 on LeetCode using Java

## Algorithm
1. Define a 2D array *numsPairings*
2. Create all possible pairings from *nums*
	1. Loop from 0 to length(nums) - 1, using variable *indexI*
		1. Loop from indexI + 1 to length(nums) -1, using variable *indexJ*
			1. Put nums[indexI] and nums[indexJ] into numsPairings individually
3. Find the GCD of each pairing
4. Store each GCD into *gcdPairs*
5. Sort *gcdPairs* in ascending order
6. Loop over *queries*
	1. Add gcdPairs[queries[i]] to answer[]
7. Return answer[]

## Issue log

```
- When I print out my 2D Array of nums pairings, I saw a lot of zeroes
+ Make sure to appropriately size your 2D array, as extra space is denoted by zeroes

- Now when I print out my 2D array, I get the index values and not the values of the nums array
+ When assigning the 2D array's values, assign them to nums[indexI] and not just indexI
```
