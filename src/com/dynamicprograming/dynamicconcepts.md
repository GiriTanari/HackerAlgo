http://www.geeksforgeeks.org/dynamic-programming-set-1/
http://www.geeksforgeeks.org/solve-dynamic-programming-problem/

Dynamic Programming is an algorithmic paradigm that solves a given complex problem by breaking it into subproblems and stores the results of subproblems to avoid computing the same results again. Following are the two main properties of a problem that suggest that the given problem can be solved using Dynamic programming.

Steps to solve a DP: 
	1) Identify if it is a DP problem
	2) Decide a state expression with least parameters
	3) Formulate state relationship    
	4) Do tabulation (or add memoization)

2 Properties :

	1) Overlapping Subproblems
	2) Optimal Substructure
		
1) Overlapping Subproblems:
	--> Dynamic Programming combines solutions to sub-problems. Dynamic Programming is mainly used when 		solutions of same subproblems are needed again and again.
	--> In dynamic programming, computed solutions to subproblems are stored in a table so that these 			don’t have to recomputed.

For example, Binary Search doesn’t have common subproblems. If we take example of following 			recursive program for Fibonacci Numbers, there are many subproblems which are solved again and again.

/* simple recursive program for Fibonacci numbers */
int fib(int n)
{
   if ( n <= 1 )
      return n;
   return fib(n-1) + fib(n-2);
}

  						fib(5)
                     /             \
               fib(4)                fib(3)
             /      \                /     \
         fib(3)      fib(2)         fib(2)    fib(1)
        /     \        /    \       /    \
  fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
  /    \
fib(1) fib(0)

==> We can see that the function f(3) is being called 2 times.
==> If we would have stored the value of f(3), then instead of computing it again, we could have 		reused the old stored value.

There are following two different ways to store the values so that these values can be reused:
	a) Memoization (Top Down)
	b) Tabulation (Bottom Up)
	
a) Memoization (Top Down): The memoized program for a problem is similar to the recursive version with a small modification that it looks into a lookup table before computing solutions. We initialize a lookup array with all initial values as NIL. Whenever we need solution to a subproblem, we first look into the lookup table. If the precomputed value is there then we return that value, otherwise we calculate the value and put the result in lookup table so that it can be reused later.

Following is the memoized version for nth Fibonacci Number.

/* function for nth Fibonacci number */
  int fib(int n)
  {
    if (lookup[n] == NIL) // check the condtion if it is avl no recursive just return the result
    {
      if (n <= 1)
          lookup[n] = n;
      else
          lookup[n] = fib(n-1) + fib(n-2);
    }
    return lookup[n];
  }
  

b) Tabulation (Bottom Up): The tabulated program for a given problem builds a table in bottom up fashion and returns the last entry from table. For example, for the same Fibonacci number, we first calculate fib(0) then fib(1) then fib(2) then fib(3) and so on. So literally, we are building the solutions of subproblems bottom-up.

int fib(int n)
  {
    int f[] = new int[n+1];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++)
          f[i] = f[i-1] + f[i-2];
    return f[n];
  }
  
  
===============================================================

2) Optimal Substructure

	A given problems has Optimal Substructure Property if optimal solution of the given problem can be obtained by using optimal solutions of its subproblems.

	
For example, the Shortest Path problem has following optimal substructure property:
If a node x lies in the shortest path from a source node u to destination node v then the shortest path from u to v is combination of shortest path from u to x and shortest path from x to v.


Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N' 	

state(7) = state (7-1) + state (7-3) + state (7-5)

In general,
state(n) = state(n-1) + state(n-3) + state(n-5)

So, our code will look like:

// Returns the number of arrangements to 
// form 'n' 
int solve(int n)
{ 
   // base case
   if (n < 0) 
      return 0;
   if (n == 0)  
      return 1;  
 
   return solve(n-1) + solve(n-3) + solve(n-5);
   	


			
	