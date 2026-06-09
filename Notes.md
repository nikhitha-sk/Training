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

Files and directory - IO package

Operations : Readers ,writers Streams
CRUD
Read - input stream
write - output stream

Buffered reader and writer

Input stream / read :
    DataInputStream
    ObjectOutputStream

Input -> DIS -> FOS -> File
File -> FIS -> sout

Serialization: 
    serialize - ObjectOutputStream
    deserialize - ObjectInputStream

Multithread:
    Multiple access / thread to the resource class
    Resource class : class must inherit either Thread class / runnable interface
    public void run(){}

Thread Life cycle:
    created/born
    Execute - run/start
    waiting - sleep/wait
    abort - stop

Lambda expression:
    (parameter1  ,parameter2) -> {}
    parameter -> {}

Method reference:


Functional Interface


Generic:
    Class - ArrayList , hashset , treemap
    method
    Interface

Immutable class

Solid principles:
    S - single responsibility
        Patient class responsible for properties
        health metrics class where bmi , body age, responsible to perform operational task

    o - Open/close  
        Google class
        youtube extendes google  //follows open/close
        drive extends google       open/close
        playstore extends youtube  //not followed
        facebook extends google  //followed
        insta extends facebook  //not followed
        threads extends insta   //not followed

    L - Liskov substitution principle
        List - parent : add, remove ,get , isEmpty
        Arraylist - child
        linkedlist - child

    I - Interface segregation principle
        Banking Interface - Deposit, withdraw
        ATM - withdraw   //violates interface segregation 
        eg:
        Credit interface - deposit method
        Debit interface - withdraw
        ATM implements Debit   //follows interface segregation

    D - Dependency inversion:
        File - storage
        Database - storage
        CRUD - storage object may be file or database
        user - may not know which has depended

DBMS:
    RDBMS

Database
    table
        columns
            types: varchar , int, double , bigint , blob(binary large object)
            index : primary key , unique, foreign,default, auto increment
        Rows/records


Mysql - server 
    mysql / MySQL shell - CLI
    work bench - GUI

CRUD: SQL
language types

DDl : create , drop, alter
      database , table , user , sequence, views , procedures, triggers, functions
DML - record : insert, update, delete
DQL - fetch , join
DCL - Authorize , unauthorize
    Grant , revoke
TCL - Transaction
     commit
     rollback   


Normal Forms: 
    