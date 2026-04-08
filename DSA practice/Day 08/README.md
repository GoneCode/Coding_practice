# Day 08 - Array Practice Questions

**Date:** April 8, 2026

## 30 Array Questions (10 per Difficulty Level)

### Easy Level

1. **Find Maximum and Minimum**
   - Find the maximum and minimum element in an array
   - Input: `[3, 5, 1, 8, 2, 9]`
   - Output: `Max = 9, Min = 1`

2. **Reverse an Array**
   - Reverse the elements of an array in-place
   - Input: `[1, 2, 3, 4, 5]`
   - Output: `[5, 4, 3, 2, 1]`

3. **Sum of Array Elements**
   - Calculate the sum of all elements in an array
   - Input: `[1, 2, 3, 4, 5]`
   - Output: `15`

4. **Search Element in Array**
   - Find if an element exists in the array and return its index
   - Input: `[10, 20, 30, 40, 50]`, target = 30
   - Output: `2`

5. **Count Even and Odd Numbers**
   - Count how many even and odd numbers are in the array
   - Input: `[1, 2, 3, 4, 5, 6]`
   - Output: `Even = 3, Odd = 3`

6. **Second Largest Element**
   - Find the second largest element in an array
   - Input: `[12, 35, 1, 10, 34, 1]`
   - Output: `34`

7. **Check if Array is Sorted**
   - Check if the array is sorted in ascending order
   - Input: `[1, 2, 3, 4, 5]`
   - Output: `true`

8. **Remove Duplicates from Sorted Array**
   - Remove duplicates from a sorted array in-place
   - Input: `[1, 1, 2, 2, 3, 4, 4]`
   - Output: `[1, 2, 3, 4]`

9. **Find Average of Array**
   - Calculate the average of all elements
   - Input: `[10, 20, 30, 40, 50]`
   - Output: `30.0`

10. **Frequency of Each Element**
    - Count the frequency of each element in the array
    - Input: `[1, 2, 2, 3, 3, 3, 4]`
    - Output: `{1:1, 2:2, 3:3, 4:1}`

### Medium Level

11. **Rotate Array**
    - Rotate an array to the right by k positions
    - Input: `[1, 2, 3, 4, 5, 6, 7]`, k = 3
    - Output: `[5, 6, 7, 1, 2, 3, 4]`

12. **Find Duplicates**
    - Find all duplicate elements in an array
    - Input: `[1, 2, 3, 2, 4, 5, 3]`
    - Output: `[2, 3]`

13. **Move Zeros to End**
    - Move all zeros to the end while maintaining the order of non-zero elements
    - Input: `[0, 1, 0, 3, 12]`
    - Output: `[1, 3, 12, 0, 0]`

14. **Find Missing Number**
    - Find the missing number in an array containing n distinct numbers from 0 to n
    - Input: `[3, 0, 1]`
    - Output: `2`

15. **Two Sum Problem**
    - Find two numbers that add up to a target sum
    - Input: `[2, 7, 11, 15]`, target = 9
    - Output: `[0, 1]` (indices of 2 and 7)

16. **Majority Element**
    - Find the element that appears more than n/2 times
    - Input: `[3, 2, 3]`
    - Output: `3`

17. **Sort Array of 0s, 1s, and 2s**
    - Sort an array containing only 0s, 1s, and 2s without using sorting algorithm
    - Input: `[2, 0, 2, 1, 1, 0]`
    - Output: `[0, 0, 1, 1, 2, 2]`

18. **Find Intersection of Two Arrays**
    - Find common elements between two arrays
    - Input: `[1, 2, 2, 1]`, `[2, 2]`
    - Output: `[2, 2]`

19. **Leaders in Array**
    - Find all leaders (elements greater than all elements to their right)
    - Input: `[16, 17, 4, 3, 5, 2]`
    - Output: `[17, 5, 2]`

20. **Stock Buy and Sell (Single Transaction)**
    - Find maximum profit from buying and selling stock once
    - Input: `[7, 1, 5, 3, 6, 4]`
    - Output: `5` (buy at 1, sell at 6)

### Hard Level

21. **Kadane's Algorithm (Maximum Subarray Sum)**
    - Find the contiguous subarray with the maximum sum
    - Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
    - Output: `6` (subarray: `[4, -1, 2, 1]`)

22. **Merge Two Sorted Arrays**
    - Merge two sorted arrays into one sorted array without using extra space
    - Input: `arr1 = [1, 3, 5, 7]`, `arr2 = [2, 4, 6, 8]`
    - Output: `[1, 2, 3, 4, 5, 6, 7, 8]`

23. **Trapping Rain Water**
    - Calculate how much water can be trapped after raining
    - Input: `[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]`
    - Output: `6`

24. **Longest Consecutive Sequence**
    - Find the length of longest consecutive sequence
    - Input: `[100, 4, 200, 1, 3, 2]`
    - Output: `4` (sequence: `[1, 2, 3, 4]`)

25. **Product of Array Except Self**
    - Return array where each element is the product of all elements except itself
    - Input: `[1, 2, 3, 4]`
    - Output: `[24, 12, 8, 6]`

26. **Find Subarray with Given Sum**
    - Find a continuous subarray that sums to a given value
    - Input: `[1, 2, 3, 7, 5]`, sum = 12
    - Output: `[2, 4]` (indices, subarray: `[2, 3, 7]`)

27. **Merge Overlapping Intervals**
    - Merge all overlapping intervals
    - Input: `[[1,3], [2,6], [8,10], [15,18]]`
    - Output: `[[1,6], [8,10], [15,18]]`

28. **Find the Duplicate Number**
    - Find the duplicate number in array of n+1 integers (1 to n)
    - Input: `[1, 3, 4, 2, 2]`
    - Output: `2`

29. **Spiral Matrix Traversal**
    - Print elements of a 2D matrix in spiral order
    - Input: `[[1,2,3], [4,5,6], [7,8,9]]`
    - Output: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

30. **Maximum Product Subarray**
    - Find the contiguous subarray with the maximum product
    - Input: `[2, 3, -2, 4]`
    - Output: `6` (subarray: `[2, 3]`)

---

## Progress Tracker

### Easy (10 Questions)
- [x] 1. Find Maximum and Minimum ✓
- [x] 2. Reverse an Array ✓
- [x] 3. Sum of Array Elements ✓
- [x] 4. Search Element in Array ✓
- [x] 5. Count Even and Odd Numbers ✓
- [x] 6. Second Largest Element ✓
- [ ] 7. Check if Array is Sorted
- [ ] 8. Remove Duplicates from Sorted Array
- [ ] 9. Find Average of Array
- [ ] 10. Frequency of Each Element

**Completed: 6/10**

### Medium (10 Questions)
- [ ] 11. Rotate Array
- [ ] 12. Find Duplicates
- [ ] 13. Move Zeros to End
- [ ] 14. Find Missing Number
- [ ] 15. Two Sum Problem
- [ ] 16. Majority Element
- [ ] 17. Sort Array of 0s, 1s, and 2s
- [ ] 18. Find Intersection of Two Arrays
- [ ] 19. Leaders in Array
- [ ] 20. Stock Buy and Sell

### Hard (10 Questions)
- [ ] 21. Kadane's Algorithm
- [ ] 22. Merge Two Sorted Arrays
- [ ] 23. Trapping Rain Water
- [ ] 24. Longest Consecutive Sequence
- [ ] 25. Product of Array Except Self
- [ ] 26. Find Subarray with Given Sum
- [ ] 27. Merge Overlapping Intervals
- [ ] 28. Find the Duplicate Number
- [ ] 29. Spiral Matrix Traversal
- [ ] 30. Maximum Product Subarray

---

**Tips:**
- Start with easy problems and work your way up
- Focus on understanding the logic before optimizing
- Try to solve each problem in multiple ways
- Consider time and space complexity
