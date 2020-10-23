# LeetCode Solutions

Find video link at my [YouTube channel](https://www.youtube.com/playlist?list=PLsowTcGqVtPgo0VSIUIbcOgNQJzblGnst)  <br>
Or from the Sheet 1 of this [Google Sheet](https://bit.ly/2EUhwnw)

[![Made with Python](https://forthebadge.com/images/badges/made-with-python.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 
[![Made with Java](https://forthebadge.com/images/badges/made-with-java.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 
[![Made with C++](https://forthebadge.com/images/badges/made-with-c-plus-plus.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/) 


| #    | Title                        | Solution    | Code            | Time | Space | Difficulty | Tags         | Video    |
|------|------------------------------|-------------|-----------------|------|-------|------------|--------------|----------|
| 0001 | [2 Sum problem](https://leetcode.com/problems/two-sum/) | Check all the combinations by looping Map, if it’s complement (target - element) and exists then return the indices of the current element and the complement. | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0001.cpp)    [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0001.java)   [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0001.py) | O(n) | O(1)  | Easy       | Hash Table Heap | [📺](https://www.youtube.com/watch?v=_ZEweLKQpY8)    |
| 0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)| Algo The strategy here uses a temporary dummy node as the start of the result list. The pointer Tail always points to the last node in the result list, so appending new nodes is easy. The dummy node gives the tail something to point to initially when the result list is empty.      | [C++]()            | O(m+n) | O(1)  | Easy       | Linked List |    [📺](https://www.youtube.com/watch?v=vGiGh33WSew)    |
| 0027 | [Remove Element](https://leetcode.com/problems/remove-element/)   | Two pointers for counting valid nos and swapping       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0027.java)   [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0027.py)         | O(n) | O(1)  | Easy       | Array Two Pointers |    [📺](https://www.youtube.com/watch?v=r9HcLcYJBNc)    |
| 0045 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/)   | newEnd = max(newEnd, i+nums[i])       | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0045.cpp)         | O(n) | O(1)  | Hard       | Array Greedy |  [📺](https://www.youtube.com/watch?v=hJ8EMc24O_M)      |
| 0053 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)   | Parse array and save the best solution at each step       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0053.java)    [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0053.py)        | O(n) | O(1)  | Easy       | Array Dynamic Programming |  [📺](https://www.youtube.com/watch?v=vkLpz2YF8Rc)      |
| 0055 | [Jump Game](https://leetcode.com/problems/jump-game/)                    | Iterate from last index and check if we can reach there from current index or not       | [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0055.py)            | O(n) | O(1)  | Medium       | Array Greedy |    [📺](https://www.youtube.com/watch?v=ymET7SJsDQc)    |
| 0062|  [Unique Paths (Total no of unique paths in m x n matrix)](https://leetcode.com/problems/unique-paths/)                  | As the first element in each row will always be 1, so maintaining one row is enough to reach bottom-right corner of the grid       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0062.java)  [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0062.py)           | O(n) | O(1)  | Medium       |Array Dynamic Programming |      |
| 0070 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)   | steps[n]=steps[n-1]+steps[n-2].       | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0070.cpp)     [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0070.py)    | O(n) | O(1)  | Easy       | Dynamic Programming |     [📺](https://www.youtube.com/watch?v=QiD2Hbwx2z0)   |
| 0072 | [Edit Distance](https://leetcode.com/problems/edit-distance/)                    | minDis(i,j)=min(minDis(i-1,j),minDis(i,j-1),minDis(i-1,j-1))+1;       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0072.py)            | O(m*n) | O(m*n)  | Hard       | String Dynamic programming |        
| 0073 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)   |   Use the first cell of every row and column as a flag. This flag would determine whether a row or column has been set to zero.     | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0073.cpp)    [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0073.py)          | O(m*n) | O(1)  | Medium       | Array |     [📺](https://www.youtube.com/watch?v=W1I7slnETp4)   |
| 0075 | [Sort an array of 0’s 1’s 2’s without using extra space or sorting algo](https://leetcode.com/problems/sort-colors/) | the logic is to count total number of 0's, 1's and 2's int the list and starting from beginning first append total 0's then total 1's and then 2's| [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0075.py) | O(n) | O(1)  | Medium     | Array   | [📺](https://www.youtube.com/watch?v=BL9H4zIFHHw&list=PLsowTcGqVtPgo0VSIUIbcOgNQJzblGnst&index=11)    |
| 0100 | [Same Tree](https://leetcode.com/problems/same-tree/)                    | Check isSame(node.left) and isSame(root.right)       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0100.java)            | O(n) | O(h)  | Easy       | Tree Depth-first-Search |    [📺](https://www.youtube.com/watch?v=ctzwuAP0iHg)    |
| 0100 | [Same Tree](https://leetcode.com/problems/same-tree/)                    | Check isSame(node.left) and isSame(root.right)       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0100.java)    [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0100.py)       | O(n) | O(h)  | Easy       | Tree Depth-first-Search |    [📺](https://www.youtube.com/watch?v=ctzwuAP0iHg)    |
| 0101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)                    | Check if left.left==right.right and left.right==right.left        | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0101.java)   [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/0101.py)           | O(n) | O(h)  | Easy       | Tree Depth-first-Search Breadth-first-Search |          [📺](https://www.youtube.com/watch?v=CgFsYbtRgQU)    |
| 0104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Depth = 1 + Max(depth of left, depth of right)        | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0104.java)  | O(n) | O(h)  | Easy       | Tree Depth-first-Search |   [📺](https://www.youtube.com/watch?v=33YXh6wRVs4)    |
| 0121 | [Best time to buy and sell stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)                    | Minimize Cost price and Maximise Profit       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0121.java)            | O(n) | O(1)  | Easy       | Array Dynamic Programming |       [📺](https://www.youtube.com/watch?v=uc6gP5pZZ6I)    |
| 0142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)                    | Floyd’s Cycle detection algorithm     | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master//Java/0142.java)            | O(n) | O(1)  | Medium       | Linked List    Two pointers |       |
| 0200 | [Number of islands](https://leetcode.com/problems/number-of-islands/)                    |  Merging adjacent lands, and the merging is done recursively       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0200.java)            | O(n∗m) | O(1)  | Medium       | Depth-First Search Breadth-First Search|    [📺](https://www.youtube.com/watch?v=vxhGsZWJRH4)    |
| 0268 | [Missing Number](https://leetcode.com/problems/missing-number/)                    | Assuming that XOR is a constant-time operation, this algorithm does constant work on nn iterations, so the runtime is overall linear       | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0268.cpp)  [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0268.java)          | O(n) | O(1)  | Easy       | Array Math BitManipulation |         |
| 0283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/)                    | Two pointers for counting valid nos and swapping       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0283.java)            | O(n) | O(1)  | Easy       | Array Two Pointers |       [📺](https://www.youtube.com/watch?v=LTUm7RYsU_U)    |
| 0287 | [Find duplicate in array of N+1 numbers](https://leetcode.com/problems/find-the-duplicate-number/) | Find the cycle using slow and fast pointer | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0287.java)     | O(n) | O(1)  | Medium     | Array Two Pointers         |          |
| 0300 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)                    | when next element in array is greater than previous element, dp[i]=maximum(dp[j]+1,dp[i])       | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0300.java)            | O(n*m) | O(n)  | Medium       | Binary Search Dynamic Programming |       
| 0451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | [LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/discuss/381436/fastest-python-on-solution-explained-in-details) [Github](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Sort%20Characters%20by%20Frequency/Solution.md) | Java Python     | O(n) | O(n)  | Medium     | Hash Table Heap         |          |
| 0509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Storing the value of two previous number and updating them | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0509.java) | O(n) | O(1) | Easy | Array | [📺](https://www.youtube.com/watch?v=bsaXukgCCdA) |
| 0647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | Extend from center, 2 function call for odd and even palindromes | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0647.java)     | O(n^2) | O(1)  | Medium     | String Dynamic Programming         | [📺](https://www.youtube.com/watch?v=ze1woFTZMpA)    |
| 0695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Apply DFS on the Gird by exploring every square connected to it 4-directionally, total number of squares explored will be the area of that connected shape. | [C++](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/C++/0695.cpp)     | O(R∗C) | O(R∗C)  | Medium     | Depth-First-Search         |    |
| 0876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/solution/) | Find the length of given linked list and then traverse from root till one less than half of linked list length and print the next node to current node | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0876.java)     | O(n) | O(1)  | Easy     | Linked List        |    |
| 0983 | [Minimum Cost For Tickets](https://leetcode.com/problems/minimum-cost-for-tickets/)                    | Here dp(i) is the cost to travel from day days[i] to the end of the plan. if days[j] < days[i] + 1 then j1=j. if days[j] < days[i] + 7 then j=j7. if days[j] < days[i] + 30 then j=j30 . dp(i)=min(dp(j1)+costs[0],dp(j7)+costs[1],dp(j30)+costs[2])    | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/0983.java)            | O(n) | O(n)  | Medium       | Dynamic Programming |    [📺](https://www.youtube.com/watch?v=2AnrAlCA578)    |
| 1347 | [Minimum Number of Steps to Make Two Strings Anagram](https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/) | Add 1 for char in s and remove 1 for char in t | [Java](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Java/1347.java)      | O(n+m) | O(1)  | Medium     | Hash Table Heap         | [📺](https://www.youtube.com/watch?v=xXXOpOYWtRE)    |
| 1352 | [Product of the Last K Numbers](https://leetcode.com/problems/product-of-the-last-k-numbers/) | Add new element to list by multiplying it with previous number and return arr[n-1]/arr[n-k-1] | [Python](https://github.com/sankalpdayal5/LeetCode-Solutions/blob/master/Python/1352.py)      | O(1) | O(1)  | Medium     | Array Design         | [📺](https://www.youtube.com/watch?v=8CuVduv0Kyg)    |


Format
| 0000 | [Ques name]()                    | Algo       | [Java]()            | O() | O()  | Easy       | Category |    [📺]()    |
|------|----------------------------------|------------|---------------------|-----|------|------------|----------|---------------|
| 0000 | [Ques name]()                    | Algo       | [Java]()            | O() | O()  | Easy       | Category |    [📺]()    |


[![Built with love](https://forthebadge.com/images/badges/built-with-love.svg)](https://github.com/sankalpdayal5/LeetCode-Solutions/)
 
