// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Input: nums = [1,2,3,1]
// Output: true

// 思路：1. use hashset.contains() to test if there is element already in there, since there is no duplication in hashset
//       2. ranking using Arrays.sort() and then compare i and i+1 element to know if there is duplication

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
            
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) {return true;}
            
            
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        for (int i=0; i<nums.length; i++){
            if (numbers.contains(nums[i])) {return true;}
            else {numbers.add(nums[i]);}
            
        }
        return false;
    }
}
