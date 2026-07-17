# LeetCode Java Problem #3312 - Sorted GCD (Greatest Common Divisor) Pair Queries
My solution to problem #3312 on LeetCode using Java

Algorithm
1. Create all possible pairings from *nums*
2. Find the GCD of each pairing
3. Store each GCD into *gcdPairs*
4. Sort *gcdPairs* in ascending order
5. Loop over *queries*
	1. Add gcdPairs[queries[i]] to answer[]
6. Return answer[]
