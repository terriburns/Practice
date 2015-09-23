#How Big? How Fast?

Questions <a href="http://codekata.com/kata/kata03-how-big-how-fast/">here</a>

#How Big

##Roughly how many binary digits (bit) are required for the unsigned representation of:

The exponent 2^x == the number of bits required

>1000

Log(1000) = 10

> 1,000,000

Log(1,000,000) = 20

>1,000,000,000

Log(1,000,000,000) = 30

>1,000,000,000,000

Log(1,000,000,000,000) = 40

>8,000,000,000,000

Log(8,000,000,000,000)

Same as above, except the 8 requires 3 additional bits

Log(8,000,000,000,000) = 43

##My town has approximately 20,000 residences. How much space is required to store the name, addresses, and ap hone number for all of these (if we store them as characters)?

1 character == 1 byte

Upper bound of name == 40 chars

Upper bound of address == 40 chars

Upper bound of phone number == 10 chars

(20,000)(40)(40)(10) = 320000000

== 320000000 bits

##I'm storing 1,000,000 integers in a binary tree. Rougly how many nodes and levels can I expect the tree to have? Roughly how much space will it occupy on the 32-bit architecture?

1,000,000 = totally number of nodes (one node/integer)

levels at best case (balance) = log(2) of 1,000,000 = 20

at worst case = 1,000,000 (which would be one node/level)

32 bit architecture = 4 bytes

Each node holds its own value, a pointer to the left child, and pointer to the right child = 12 bytes

12,000,000 bytes. But the final level of nodes are leaves (so do not have pointers to the left and right children). 

Thus, the final level of nodes only have 4 bytes of data, not 12.

So the total is... 
