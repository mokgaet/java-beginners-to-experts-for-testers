# Decision Structures

## Learning Objective 1: Explore different operators in java
1. **Assignement**
- Assignment operators are used to assign values to a variable.
2. **Arithmetic**
- There are four basic arithmetic operations: +, -, *, /, as well as the modulus (%)
  operator which is used to obtain division remainder.
3. **Increment and decrement**
- These operators are used to increment or decrement a variable by one. This can be
  simplified with the increment (++) and decrement (--) operators.
- x++; simplified as:  x = x+1;
- x--;  simplified as:  x = x-1;

**Pre and Post**
- The increment operator can increase the value of the variable by 1 before or after
  assigning it to a variable.
- _Pre-increment_ – used to increment a value of a variable before using it. In pre
  increment, value is first incremented before it can be used inside the
  expression.
- _Post-increment_ – used to increment the value of the variable after the
  statement or expression is executed. In post-increment, value is first used in an
  expression and then incremented.
 
===============================
- x++; // post-increment
- x--; // post-decrement
- ++x; // pre-increment 
- --x; // pre-decrement

5. **Comparison**
- used to compare two values and return true or false
-  b = (2 == 3); // equal to (false)
- b = (2 != 3); // not equal to (true)
- b = (2 > 3); // greater than (false)
- b = (2 < 3); // less than (true)
- b = (2 >= 3); // greater than or equal to (false)
- b = (2 <= 3); // less than or equal to (true)
5. **Logical**
- Logical operators are used together with comparison operators (not always)  
- boolean b = (true && false); // logical and (false)
- b = (true || false); // logical or (true)
- b = !(true); // logical not (false)


> **What is an atomic condition?** a condition that you can not break it down any further
> for example: (c && a ) || (x > y) : here we have 3 conditions, c and a are atomic conditions , then x>y are logical conditions
## Learning Objective 2: Planning decision making logic



