# Lab 10 - Hashing

_**Note:** Files already exist for the following classes:_
- `src/main/java/Lab10.java`
- `src/main/java/Hashtable.java`
- `src/main/java/LinearHashtable.java`
- `src/main/java/QuadraticHashtable.java`

## Overview
In this lab assignment, we will implement the insertion behaviour, as well as two different probing methods, and compare the two probing methods.  The code implementing the data storage (via an `ArrayList`) with generics support has been provided.

## Instructions
The repository includes a driver class (`Lab10`), and a class for the hash table itself (`Hashtable`).  There is an empty function in the `Hashtable` class, called `insert()`, that needs to be implemented (this is the same for both linear and quadratic probing).  Furthermore, there are two subclasses, `LinearHashtable` and `QuadraticHashtable`, which need to be implemented to provide the definition of the `rehash()` method.

The difference between the `LinearHashtable` and `QuadraticHashtable` classes is simply how the next hash position is chosen, when a collision occurs.  The `rehash()` method is used when determining the hash table index.  When the initial index, returned by the provided `hash()` method, represents a space in the array list that is already occupied, a probing strategy is used.  The `rehash()` method takes the previously found index (which represents an occupied space in the array list), and uses it to determine the next index.  `rehash()` will implement these strategies:

1.	`LinearHashtable` – the `rehash()` method will simply add one to the previous index, returning the new value modulus the size of the array list (capacity)
    - This is called linear probing
    - https://en.wikipedia.org/wiki/Linear_probing 
2.	`QuadraticHashtable` – the `rehash()` method will square the previous index, returning the new value modulus the size of the array list (capacity)
    - This is a variation of a probing strategy called quadratic probing
    - https://en.wikipedia.org/wiki/Quadratic_probing 

The `insert()` method will continuously call `rehash()` until an unoccupied position has been found, then it will insert to the new value at that position.  While performing the probing, use the instance variable probeCount to keep track of how many probes is required for both hash tables.

## Compiling and Running Your Program
To compile and run your program, use the following command:
`gradle run`

If you want to see if your program passes the tests, i.e. is correct, use the following command:
`gradle test`

## Submission Instructions
Modify the Java classes as described in this document, and add any additional classes you decide you want to write to complete this lab assignment.  Commit and push your code to this repository.

Every lab assignment is due by the start of the following lab period, giving you an extra week to work on it.  Do not expect to continue to work on it during this next lab period, as the lab instructor will not permit that, since it would lead to you missing potential instructions/help for the next lab.

This repository will be marked by the lab instructor at their convenience, but any changes made to this repository after the due date (described above) will not be considered.  Labs not submitted on time, with the exception of documented absences/illnesses or SAS accommodations, will not be accepted.

## Getting Help
If you run into difficulty, you may wish to check out some of the following resources:
- https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html - A series of tutorials for the Java programming language, focusing almost entirely on the features of Java
- https://docs.oracle.com/en/java/javase/14/ - The standard documentation for Java classes, including methods that you can use, some of which will be discussed later in this course
- http://stackoverflow.com/ - A forum for asking questions about programming. Chances are, someone else has asked the same question as you have, and some knowledgeable person has already answered it.  This might be a good time to use the ‘site:’ feature in Google!

Of course, you can always ask the lab instructor for help! However, learning how to find the answers out for yourself is a skill that will pay off in the future, as solving your own problem is immediate (and satisfying)!

## Academic Integrity
Discussing strategies with your fellow students is acceptable, but once it is time to write the code you should do so on your own.  The instructor has learning goals planned for this course which are cumulative.  If you fail to learn some elements in this lab assignment, it most likely will affect your performance on higher-stakes assessments in the future.  You can also ask the lab instructor for help, but they won't directly solve your problems for you, but will rather point you in the right direction to find the solution yourself.