# Debugging a Sales System

#### Objective: 
To use debugging techniques to identify and fix issues in a simple sales system.

#### Required Time: 60 minutes

#### Difficulty Level: Beginner

#### Scenario: 
You have been tasked with fixing a sales system that has a bug preventing it from adding items to a sale.

#### Task List:

* Open the provided Java program in an IDE with debugging capabilities.
* Start debugging mode and set a breakpoint at the line where the program adds an item to a sale.
* Step through the program until the bug occurs.
* Use the debugger to inspect the values of relevant variables and determine the cause of the bug.
* Fix the bug and test the system to ensure that items can now be added to a sale.

#### Expected/Sample Output:

<pre>
Before fixing the bug:

Enter item name: pencil
Enter item price: 1.5
Enter item quantity: 2
Exception in thread "main" java.lang.NullPointerException
	at src.Sale.addItem(src.Sale.java:12)
	at Main.main(Main.java:11)

After fixing the bug:

Enter item name: pencil
Enter item price: 1.5
Enter item quantity: 2
Item added successfully.
src.Sale total: 3.0

