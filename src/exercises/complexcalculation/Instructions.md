#Multithreaded Calculation
In this coding exercise, you will use all the knowledge from the previous lectures.
Before taking the exercise, make sure you review the following topics in particular:
1. Thread Creation - how to create and start a thread using the Thread class and the start() method.

2. Thread Join - how to wait for another thread using the Thread.join() method.



In this exercise, we will efficiently calculate the following result = base1 ^ power1 + base2 ^ power2

Where a^b means: a raised to the power of b.

For example 10^2 = 100

We know that raising a number to a power is a complex computation, so we like to execute:

result1 = x1 ^ y1

result2 = x2 ^ y2

In parallel.

and combine the result in the end : result = result1 + result2

This way, we can speed up the entire calculation.



Note :

base1 >= 0, base2 >= 0, power1 >= 0, power2 >= 0

