# Data Structures & Algorithms

## Big O

- Big O notation is used to describe the performance of an Algorithms
  - technical definition: describes limiting behavior of a function as argument goes towards particular value (or infinity)
- helps us determine if a given algorithm is scalable or not (as input grows larger)
  - just because code performs well on our computer doesn't mean it will stand up to a large data set
- An operation can become more costly depending on what data structure we use
- When we talk about each method we describe it in terms of Runtime Complexity
- "O" derives from Omicron, and meant "order" in German: "Ordnung von"
- We don't care about specific values, we just want an approximation of how much an algorithm slows down as the input grows larger

### <ins>Time complexity</ins>

#### O(1) - Constant time

- "Big O of 1"
- No matter what our input is
- O(2) can be simplified as O(1)

#### O(n) - Linear time

- n represents the size of the input; as n grows the cost of this algorithm also grows linearly
- Example: for loop, for each loop, while loop, do while loop (anything operation that iterates)
- The size of the input matters
- O(1 + 1 + n) is still O(n): the cost of the algorithm still increases linearly in direct proportion to size of our input
- O(2n) is still O(n): approximation is stil a linear growth
- With 2 inputs O(n + m) is still O(n): approximation is stil a linear growth

#### O(n^2) - Quadratic time

- Example: nested loops (for loop within a for loop)
- As our input grows larger and larger algorithms get slower and slower
- O(n + n^2) can be simplified to n^2: because n^2 always grows faster than n, we just approximate to n^2
- O(n^3): will get far slower than O(n^2)

#### O(log n) - Logarithmic time

- more efficient and scalable than linear or quadratic algorithms
- operation cost grows slower and slower the bigger our input is
- Example: finding number 10 in an array of 10,
  - Linear search: we have to iterate through every item in the list
  - Binary search(logarithmic): checks middle item, compares with target number, and narrows down to remaining partition
    - we can cut operation nearly in half; don't need to inspect every item in the array
- Trees and graphs utilize logarithmic time

#### O(2^n) - Exponention time

- not scalable at all
- opposite of logarithmic growth
- operation cost grows faster and faster

### <ins>Space Complexity</ins>

#### O(x)

- In an ideal world we want our algorithms to be super fast and not take up a lot of memory
  - unfortunately this doesn't really happen, so we have to make tradeoffs
  - Case 1: we have more space so we can utilize that to optimize an algorithm and make it faster and more scalable
  - Case 2: limited space, an app for a small mobile device. We have to optimize for the space because scalability is not a big factor (only 1 user at a time)
- O(x): describes how much space an algorithm requires
- Example: a method that takes an array of Strings and prints out a message with each name
  - takes O(1) space: only allocates memory for the additional variable (the iterator)
  - doesn't matter if input has 10 or 1 million items
  - if we declare a String array that is copy of our input array (has same length)
    - takes O(n) space: the more items we have in our input array the more space our method is going to take (in direct proportion to input array)
- When we talk about space complexity we only look at the additional space that we should allocate relative to the size of the input
  - We always have the input of size n so we don't count it; we just analyze how much extra space we need to allocate to this algorithm
- We will focus mostly on Runtime Complexity (because it's a bit more tricky)
- Always think about ways to preserve memory in our applications

## Arrays

- Simplest data structure that can store anything (objects, string, numbers, etc.)
- These items get stored sequentially in memory.
  - Array of integers, 4 bytes each goes one by one in memory like [10: 100, 20: 104, 30: 108]
  - for this reason looking items in an array by their index is super fast, because it knows exactly where to access

Lookup - O(1)

- If we need to store a list of items and access them by their index then array are the optimal data structure

Limitations\*

Insert - O(n)

- Arrays are usually static (in most languages, like Java), which means that we have to specify their size ahead of time
  - if we're not sure then we have to make a guess (if too large then we waste memory, if too small then our array gets filled too quickly)
- To add another item we have to resize the array
  - usually involves creating a new array and copying all the old items from new array to old array (can be costly)
- The cost of copying items into a new array increases linearly in direct proportion to size of the array

Delete - O(n)

- best case scenario: O(1), removing last item (pretty easy to just look up its address in memory and delete it)
- worst case scenario: O(n), when removing an item from beginning of array - we have to shift all items to the right to fill in the hole
  - The more items we have the more this shifting operation is going to cost us

\* To avoid these poor performing scenarios we use Linked Lists
