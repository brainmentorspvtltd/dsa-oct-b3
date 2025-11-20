# DSA Practice Problems – Moderate to Complex Level  
## Suitable for Java and Logic-Oriented Students  
  
  
### Digit-Level Logic Problems  
1. **Print All Digits of a Number**  
   Extract and print each digit without converting to a string.  
1. **Sum of All Digits**  
   Input: `5271` → Output: `15`  
1. **Reverse a Number Without String Functions**  
   Input: `321` → Output: `123`  
1. **Check if Number is Palindrome**  
   Input: `121` → True, Input: `123` → False  
1. **Check if Number is Prime**  
   Use loop from `2` to `√n` to check divisibility.  
1. **Check if Number is Armstrong Number**  
   Example: `153 = 1³ + 5³ + 3³`  
1. **Check if Number is Strong Number**  
   Example: `145 = 1! + 4! + 5!`  
1. **Calculate Digital Root (Sum of Digits until Single Digit)**  
   Input: `9875 → 9+8+7+5 = 29 → 2+9 = 11 → 1+1 = 2`  
1. **Swap First and Last Digit**  
   Input: `1234` → Output: `4231`  
1. **Count Frequency of Each Digit**  
	- Input: `72427` → Output: `{7:2, 2:2, 4:1}`  
1. **Count Digits That Divide the Number**  
	- Input: `122` → `1` and both `2`s divide 122 → Output: `3` as 3 digits can divide input  
	- Input: `123` → `1` and both `3` divide 123 → Output: `2` as 2 digits can divide input  
	- Input: `235` → `5` divides 235 → Output: `1` as only 1 digit can divide input  
1. **Count Even and Odd Digits Separately**  
  
  
### Number Transformation and Position Manipulation  
1. **Flip Digits by Position from Right**   
    - Each digit of the original number should now be placed at the position it originally had from the right side.  
    Digit:   3   2   1   4   5   
    Index:   5   4   3   2   1  
    ---------------------------  
    Output:  1   2   5   4   3  
1. **Rotate Number Right by k Positions**  
	- Input: `12345`, k = 2 → Output: `45123`  
1. **Rotate Number Left by k Positions**  
	- Input: `12345`, k = 2 → Output: `34512`  
1. **Check if All Digits Are Unique**  
	- Input: `1234` → True, `1123` → False  
1. **Check if Digits are in Ascending Order**  
	- Input: `1249` → True, `213` → False  
1. **Form Max and Min Number Using Digits**  
	- Input: `4312` → max = `4321`, min = `1234`  
1. **Interleave Front and Back Digits**  
	- Input: `123456` → `16` `25` `34` → Output: `162534`  
1. **Reverse Number and Check Divisibility by Original**  
	- Input: `12 → 21 → Is 12 % 21 == 0?`  
  
  
### Mathematical Operations and Number Theory  
1. **Find GCD of Two Numbers (Euclidean Algorithm)**  
1. **Find LCM of Two Numbers using GCD**  
1. **Find Missing Digit to Make Number Divisible by 9**  
	- Input: `27_3` → Find `_` so total sum divisible by 9  
1. **Sum of Squares of All Digits**  
  
  
### Logic-Based Analysis  
1. **Check if Number Has Repeating Digits**  
  
    #### Example 1:  
    - **Input**: `1234`  
    - **Digits**: 1, 2, 3, 4 → All unique  
    - **Output**: `False`  
  
    #### Example 2:  
    - **Input**: `1223`  
    - **Digits**: 1, 2, 2, 3 → Repeating  
    - **Output**: `True`  
  
  
1. **Check if Number is a Special Number**  
*(Sum of factorials of digits divides the number itself)*  
  
    #### Example 1:  
    - **Input**: `145`  
    - **1! + 4! + 5! = 1 + 24 + 120 = 145**  
    - **145 % 145 == 0**  
    - **Output**: `True`  
  
    #### Example 2:  
    - **Input**: `123`  
    - **1! + 2! + 3! = 1 + 2 + 6 = 9**  
    - **123 % 9 != 0**  
    - **Output**: `False`  
  
  
1. **Find First Non-Repeating Digit in a Number**  
  
    #### Example 1:  
    - **Input**: `1213471`  
    - **Digit Counts**: 1(3), 2(1), 3(1), 4(1), 7(1)  
    - **First unique digit**: `2`  
    - **Output**: `2`  
  
    #### Example 2:  
    - **Input**: `991199`  
    - **All digits repeating**  
    - **Output**: `None` or `No non-repeating digit`  
  
  
1. **Check if Number is a Harshad Number**  
*(Number divisible by sum of its digits)*  
  
    #### Example 1:  
    - **Input**: `18`  
    - **Digit sum**: 1 + 8 = 9  
    - **18 % 9 == 0**  
    - **Output**: `True`  
  
    #### Example 2:  
    - **Input**: `23`  
    - **Digit sum**: 2 + 3 = 5  
    - **23 % 5 != 0**  
    - **Output**: `False`  
  
  
1. **Histogram of Digit Frequencies (0–9 Count Array)**  
  
    #### Example 1:  
    - **Input**: `1238909`  
    - **Output**:  
    `[0:1, 1:1, 2:1, 3:1, 4:0, 5:0, 6:0, 7:0, 8:1, 9:2]`  
  
    #### Example 2:  
    - **Input**: `505151`  
    - **Output**:  
    `[0:1, 1:2, 2:0, 3:0, 4:0, 5:3, 6:0, 7:0, 8:0, 9:0]`  
  
---  
  
This set is designed for students who have finished syntax and are comfortable with loops, conditions, and arithmetic logic in Java. All problems are well-scoped for in-class discussion or home assignments.  
