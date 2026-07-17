# LeetCode Java Problem #3312 - Sorted GCD (Greatest Common Divisor) Pair Queries
My solution to problem #3312 on LeetCode using Java

## Algorithm
1. Define a 2D array *numsPairings*
	1. Determine the number of combinations ahead of time and put that number as the number of rows
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

## Combinations formula

```math
C(n, r) = n! / (r! * (n - r)!)
```

n is the length of the *nums* array (number of available items to choose from)
r = 2 (the number of items to take for each combination)

## Issue log

```diff
- When I print out my 2D Array of nums pairings, I saw a lot of zeroes
+ Make sure to appropriately size your 2D array, as extra space is denoted by zeroes

- Now when I print out my 2D array, I get the index values and not the values of the nums array
+ When assigning the 2D array's values, assign them to nums[indexI] and not just indexI

- Currently, I have the number of rows for the numPairings 2D array at 3, but what if the nums array is of a different length and therefore results in different numbers of pairs?
+ Calculate the number of combinations ahead of time so the 2D array is always the perfect size  
```

# References

1. My Java course notes
2. Gemma-2b via Ollama
