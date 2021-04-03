// Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

// Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

// You may assume that each input would have exactly one solution and you may not use the same element twice.
s
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
// 思路：a b 两个指针指向numbers数组的index位置，根据当前sum与target的比较结果来决定指针移动的方向

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length-1;
            
        while(a_pointer < b_pointer){
            int sum = numbers[a_pointer]+numbers[b_pointer];
            if (sum > target){
                b_pointer -=1;
            }
            else if (sum < target){
                a_pointer+=1;
            }
            else {
                return new int[] {a_pointer+1,b_pointer+1};
            }   
            
        }
        return new int[] {a_pointer+1,b_pointer+1};
    }
}