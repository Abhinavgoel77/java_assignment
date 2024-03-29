// QUESTION - Consider the four core interfaces, Set, List, Queue,  and Map. For each of the following four assignments, 
// specify which of the four core interfaces is best-suited,  and explain how to use  it to implement the assignment.
 
 //   1.Whimsical Toys Inc (WTI) needs to record the names  of all its employees.  Every  month, an employee 
 //    will be chosen at random from these  records to receive  a free toy.
 
 //   2.WTI has decided that each new product will be named after an employee  but only first names  will be used, 
 //    and each name will be used  only once. Prepare  a list of unique  first names.
 
 //   3.WTI decides that it only wants to use  the most popular names  for its toys. Count up the number of employees 
 //     who have each first name.
 
 //   4.WTI acquires  season tickets  for the local lacrosse  team, to be shared by employees.  Create  a waiting list for 
//      this popular sport

Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.
=>  List. we can Choose a random employee by picking a number between 0 and size()-1.

WTI has decided that each new product will be named after an employee — but only first names will be used, and each name will be used only once. Prepare a list of unique first names.
=>  Set. sets implement this interface don't allow the same element to be entered more than once.

WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.
=>   Map, where the keys are first names, and each value is a count of the number of employees with that first name.

WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.
=>   Queue. Invoke add() to add employees to the waiting list, and remove() to remove them.