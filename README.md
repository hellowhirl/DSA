### Data Structures & Algorithms

# Time and Space Complexities

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

# Linear Data Structures

A line of items one after the another

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

```java
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

All Stack operations run in Time of O(1) - because items are simply added & removed from the end

Stacks do not have lookups, because they are not meant for that (except for rarely used search() method)

Any task that involves doing something in reverse order then Stacks are the way to go

## Queues

Used anywhere we want to process jobs based on the order they are received

First-In-First-Out (FIFO)

We have a resource, and that resource must be shared amongst many consumers
- consumers should line up one by one to use the resource
  - printers: prints jobs in order they are submitted
  - operating systems: manage processes, which wait in queue for their turn to run
  - web servers: manage incoming requests, processed in order received
  - Live support systems: can only service one person/ticket at a time
  
### Queue Operations

- enqueue
  - adding an item at the back of the queue
- dequeue 
  - removing an item at the front of the queue
- peek 
  - getting item from the front without removing it
- isEmpty()
- isFull()

All Queue operations run in Constant Time of O(1) - because items are simply added or removed from the ends

- In Java Queues do not have code like a Class so we cannot instantiate them
  - A Queue is an Interface
  - Interfaces are 'contracts', it declares the list of methods that Queue implementations should provide
    - it says "anyone who wants to implement a Queue should have these methods"
  
- The two class implementations that we use for Queues most of the time are ArrayDeque and LinkedList
  - Dequeue is short for 'double-ended queue'
  - Can add items from any direction: internally this class uses a resizable array to store the items

### Queue Interface Methods

- Enqueue
  - add()
  - offer()
    - if queue gets full then add() will throw an exception, whereas offer() offers a value but the queue may not accept it
    - Sometimes queue can get full depending on implementation (may have a limit)

- Dequeue
  - pull()
  - remove()
    - if queue is empty then remove() will throw an exception, whereas pull() will return null

- Peek
  - peek()
  - element()
    - if queue is empty then element() will throw an exception, whereas peek() will return null
  
```java
Queue<Integer> queue = new ArrayDeque<>();

//`Queue<Integer> queue` is the Interface (contract)

//`new ArrayDeque<>();` is the implementation
```

There are 3 ways to implement a Queue; we can store the items in:
- Array
- Linked List
- Stack

### Circular Arrays

- when we have space an array it is more efficient to use it than resizing the array
- circular arrays connect the end of an array to its beginning (like a circle)
  - technically there is no circle in memory (as all items are stored ssequentially in order) but this is how we visualize it
- To implement

### Priority Queues

- objects are processed based on their priority (not the order in which they joined the queue)
- In Java there is the class `PriorityQueue`; it is a generic<> class
- There are 2 ways we can implement Priority Queues
  - Arrays
  - Heap

## Hash Tables

### Basics

- Helpful for super fast lookups. They are used in:
  - Spell checker: can look up a word amongst 1,000's of words in less than a second
  - Dictionaries: quicly find a translation in another language
  - Compilers: look up address of functions and variables
  - Code edtiors: or anywhere we want to look up an item super fast
  
- Each programming language has their own version of Hash Tables
  - Object (JavaScript), Hash Table (Java), Dictionary (Python and C#)

- We use Hash Tables to store key/value pairs
- A Hash Table takes the key, passes it to a Hash function and that tells where that object should be stored in memory
- Hash function is "deterministic"
  - every time we give it the same input it will return the same value
    - this is why we can use it for both storing and retrieving objects
  
- internally a Hash Table uses an Array to store our objects

#### Hash Table Operations

Insert - O(1)
  - put()

Lookup - O(1)
  - containsKey(), containsValue()
  - keySet(), entrySet(), values()

Delete - O(1)
  - remove()
    

All operations are Time O(1) because we don't have iterate over entire array of objects

### Hash Tables in Java

- use a Map interface, which is a contract that declares all the methods that map data structures should provide
  - most of the time we just use the HashMap class
  - in Hash Maps we can store strings, numbers, even null values (for both key and value)
  
### Hash Functions (hashing)

- internally a hash table maps a key to an index value
- a hash function is a function that gets a value to a different kind of value (an index value)
- the value from a hash function known as hash value, hash code, digest, or hash
  
- There are many algorithms for calculating hashes for cryptography, passwords, etc.
  - a hash function generates a long and complicated string based on a password for a hash value
  - each hash value will have a hash index (number) to be stored in an array 
  
- In Java every object has a method called:
  
`hashCode()`

  - for example it will convert a string to a hash value
  - the HashMap class in Java uses this hash code and then does some extra work to map it to an index value

### Collisions

- When 2 distinct keys generate the same value, we can deal with it in 2 approaches
  - Chaining: adding at end of linked list
  - Open Addressing : find different slot for storing the 2nd value

### Chaining

- Ex. we have an array of 5 cells for storing items (in buckets/slots which are initially null/empty) 

K = 6, V = A  (6 % 5 = 1)
- We don't store a value directly in a cell, instead we wrap in a linked list node
  - then we have the cell at index 1 point to this node with value: A
- 11 % 5: go to cell at index 1, store the value at the end of the linked list
- with this approach we no longer have collisions so these linked lists can grow or shrink automatically

### Open Addressing

When we have a collision we should probe for an empty slot

#### Linear Probing (VERY SLOW)

- seardching for another open location and moving forward until we find an empty slot
- if we can't find any open slots then it means our table is full
- Formula (apply modulus operator): 
  
`hash(key) + 1`

- `i` is like a loop variable, incremeenting by 1 at each step (starts at 0)
- it's possible that `i` ends up being outside our array, so we should apply the modulus operator (%)
  - this reduces the result to a range that can fit within the array
- Cluster: probing takes longer around back to back filled value patches, adding at end of cluster

#### Quadratic Probing

- Formula: 
  
`(hash(key) + i^2) % table_size`

- if we change `i` to `i^2` then we have a quadratic equation
- key value pairs get spread out more widely - solves cluster problem
- other problem: may end up in infinte loop after jumping outside of array over and over

#### Double Hashing

- use a different independent hash function to calculate the number of steps to go to insert in empty space
- Formula:

A popular 2nd hash function:

`hash2(key) = prime - (key % prime)`

Calculate the index using the double hashing algorithm:

`(hash1(key) + i * hash2(key)) % table_size`

- `prime` is a prime number that should be smaller than our table
- origins of this formula: who knows
- the only difference is now we use i times the 2nd hash value
- for a large array the key value pairs will be more spread out

Table of 5 slots (0 - 4) example (K = 11, V = C), (key 1,A and 3,B are full) collision case:

```
hash1(key) = key % table_size
hash1(key) = 11 % 5 = 1

hash2(key) = prime - (key % prime)
hash2(key) = 3 - (11 % 3)` = 1

index = (hash1(key) + i * hash2(key)) % table_size`
index = (1 + 1 * 1) % 5 = 2
```

# Non-Linear Data Structures

## Binary Trees

- a tree is a data structure that stores elements in a hierarcy
  - the elements are referred to as Nodes and lines that connect them as Edges
  - each Node contains a value/data
    - can be integers or objects
  
- Root: the top node in a tree
  - has children - if it has 2 children Nodes then this root Node is their parent
  
- Nodes in middle can have children as well
  Leaf Nodes: these are at the bottom and don't have any children
  
- a tree that has a maximum of 2 children is called a Binary Tree

### Applications for Trees

- Anywhere we want to represent hierarchical data (organization chart, files/folders)
- Databases - use trees for indexing and quickly look up data
- Autocompletion - Chrome matches your query with previously stored queries
- Compilers - syntax trees to parse expressions
- Compression (JPEG, MP3)

#### Binary Search Tree

- left < node < right
- all nodes in left sub-tree will be smller than parent node, and vice versa for right sub-tree
- we can quickly look up a value with a binary search tree (don't need to traverse entire tree/list)

#### Logorithmic Time, O(log n)

- whenever we throw out half of our items and narrow down our search we have logorathimic time complexity
- in trees all operations are O(log n); assumed for the case when we have a Good Binary Search Tree
  - Lookup
  - Insert, uses Lookup algorithm to find where to isnert (setting link is O(1) though)
  - Delete, uses Lookup algorithm, remove from tree by reconnecting the Edges
  
