swapping without 3rd variable:
a=a^b
b=a^b
a=a^b

a ^= b
b ^= a
a ^= b

temp = a
a = b
b = temp

^ -start
$ -end
?= - optional (0 or 1)
*
+
Pattern.matches -
 ^[A-Za-z]{3,}$ - full name
 ^(?=/#)

static block has high priority and it executes before main method.

.equals
.equalsIgnoreCase 

OOPS - ensures security and reusability

Exceptions are classes
    ArrayIndexOutOfBoundsException
    ClassNotFoundEXception
    InputMismatchException
    IOException
    InterruptedException

Compile/Checked exception - handled by developer,checked before execution
    IOException
    InterruptedException

Runtime / unchecked exception
    ArrayIndexOutOfBoundsException
    ClassNotFoundEXception
    InputMismatchException

Throwable - interface
Exception
RuntimeException - class

Handle the expression
    try{} - possible lines of code which maybe suspicious
    catch(){}
    finally{}

    throws
    throw - forward the expression

Collection framework:
    Dynamic memory allocation unlike array.

    Storage classes: can created via legacy , factory pattern

    Iterable
    Collections
    List - Arraylist , Linked List
    Queue - Priority queue , Deque
    Set - LinkedHashSet , HashSet , TreeSet
    Map - HashMap , TreeMap , HashTable

    Generic - type specific
    Non generic - non type specific

    Drawbacks of array:
        Insecure
        Fixed size
        No built in methods
        
    Priority queue follow last in first out unlike queue

