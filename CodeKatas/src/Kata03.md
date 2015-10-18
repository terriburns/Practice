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

12,000,000 bytes.


#How Fast

##My copy of Meyer’s Object Oriented Software Construction has about 1,200 body pages. Assuming no flow control or protocol overhead, about how long would it take to send it over an async 56k baud modem line?



##My binary search algorithm takes about 4.5mS to search a 10,000 entry array, and about 6mS to search 100,000 elements. How long would I expect it to take to search 10,000,000 elements (assuming I have sufficient memory to prevent paging).

Binary search has 0(logn) search time. log(10,000) = 9 --> 9/2 = 4.5

so log(10,000,000) =~ 23 --> 23/2 = 11.5

== 11.5 seconds (?)

##Unix passwords are stored using a one-way hash function: the original string is converted to the ‘encrypted’ password string, which cannot be converted back to the original string. One way to attack the password file is to generate all possible cleartext passwords, applying the password hash to each in turn and checking to see if the result matches the password you’re trying to crack. If the hashes match, then the string you used to generate the hash is the original password (or at least, it’s as good as the original password as far as logging in is concerned). In our particular system, passwords can be up to 16 characters long, and there are 96 possible characters at each position. If it takes 1mS to generate the password hash, is this a viable approach to attacking a password?
