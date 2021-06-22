# data-structure-problems

1. UnOrdered List
a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List.
Take a user input to search a Word in the List. If the Word is not found then add it
to the list, and if it found then remove the word from the List. In the end save the
list into a file
b. I/P -> Read from file the list of Words and take user input to search a Text
c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node
Object. Each node object must hold at least two pieces of information. One ref to
the data field and second the ref to the next node object.
d. O/P -> The List of Words to a File.

2. Ordered List
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a
Linked List. Take user input for a number, if found then pop the number out of the
list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new number
c. Logic -> Create a Ordered Linked List having Numbers in ascending order.
d. O/P -> The List of Numbers to a File.

3. Simple Balanced Parentheses
a. Desc -> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
b. I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed
parenthesis “)”. At the End of the Expression if the Stack is Empty then the
Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(),
pop(), peak(), isEmpty(), size()
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.

5. Palindrome-Checker
a. Desc -> A palindrome is a string that reads the same forward and backward, for
example, radar, toot, and madam. We would like to construct an algorithm to
input a string of characters and check whether it is a palindrome.
b. I/P -> Take a String as an Input
c. Logic -> The solution to this problem will use a deque to store the characters of
the string. We will process the string from left to right and add each character to
the rear of the deque.
d. O/P -> True or False to Show if the String is Palindrome or not.

6. Write a program Calendar.java that takes the month and year as command-line
arguments and prints the Calendar of the month. Store the Calendar in an 2D Array,
the first dimension the week of the month and the second dimension stores the day
of the week. Print the result as following.

7. Create the Week Object having a list of WeekDay objects each storing the day (i.e
S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are stored in a Queue
implemented using Linked List. Further maintain also a Week Object in a Queue to
finally display the Calendar
Note - If a particular day has no date then the date is set as empty string and add it
to queue.
8.  Modify the above program to store the Queue in two Stacks. Stack here is also
implemented using Linked List and not from Collection Library
