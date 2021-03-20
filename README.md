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

// we use Arrays class to use `toString` method

```
System.out.println(Arrays.toString(numbers)); 
```
Java has 2 implementations of dynamic arrays, classes from java.util package 
- Vector: grows by 100% of its size every time it gets full - synchronous
- ArrayList: goows by 50% of its size every time it gets full - asynchronous 

## Linked Lists

- 2nd most common data structure (after arrays)
  - they solve many of the problems with arrays - used for complex data structures
  
- Used to store a list of objects in sequence
- Unlike arrays, linked lists can grow and shrink automatically
- Consists of a group of nodes in sequence
  - holds 2 pieces of data: value and address (reference) of next node in the list
      - any random location can be assigned in memory
  - First node is Head and last node is Tail
  
Lookup 
- By value: O(n)
- By index: O(n)

Insert
- At end: O(1) - we have reference to Tail
- At beginning: O(1) - we have reference to Head
  - and then we simply update the links (references)
- At middle: O(n)

Delete
- Beginning: O(1) - have the Head point to the 2nd node, also remove link from previous Head
  - Then garbage collector will clean up unused node
- End: O(n)
- Middle: O(n)

In InteliJ we can set a stopper and run Debug mode to inspect our objects and see if they are structured properly

As we are implementing operations in our data structures we should think about efficiency.

### Arrays vs Linked Lists

Need to be able to explain in terms of time (above) and space complexity (below)

#### Space

- Static arrays have a fixed size
  - If we don't know size in advance then we should use dynamic arrays or linked lists
  
- Dynamic arrays grow by 50%-100% every time they're resized and may end up wasting memory
- Linked lists only take as much memory as they really need - grow and shrink automatically
  - Up front they tend to take up more memory because they are storing and value and address of next node
  
- Example: if we have a rough estimate of 100 items we should use a dynamic array, and set size to 100 at first
- We need to understand what kind of problem that we are trying to solve, and consider the tradeoffs

### Types of Linked Lists

Singly and Doubly

- Both can be circular: the last node will reference the first node
  - Use case: a music player that plays every song in a list then goes back to beginning after reaching the end

#### Doubly

- contains an additional field which is a reference to the previous node
- Deleting from the end becomes O(1) operation; can be a negligible gain in performance
  - We can traverse the list backwards
  
General tips:
- Always try to simplify a problem - try to find solution for one specific case
  - Once we solve a specific problem then we can generalize our algorithm
  
- A lot of linked list problems can be solved using 2 pointers (pointing to 2 different nodes)

## Stacks

Powerful data structures that can help us solve complex programming problems
- undo function
- compilers (eg syntax checking)
- evaulate arithmetic expressions in calculator like: 1 + 2 * 3
- navigation in applications (back and forward buttons)

Last In First Out (LIFO) Principle
- example: the last action that was performed is first one that can be undone

Internally an Array or LinkedList is used to store the items in a Stack

A Stack is a wrapper around an Array/LinkedList that gives us different way to store and access bojects

### Stack operations
- push(item) - adds item on top of the stack
- pop() - removes item on top
- peek() - returns item on top without removing
- isEmpty() - returns boolean whether stack is empty or not

All Stack operations run in Time of O(1)

Stacks do not have lookups, because they are not meant for that (except for rarely used search() method)

Any task that involves doing soething in reverse order then Stacks are the way to go