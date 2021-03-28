// question
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// 主要思想，先构建第一行，然后后面的行循环构建，并加入到triangle中去
// 注意：每行开头结尾是1，开头结尾不放入循环，中间的数是由上一行来决定的，也就是对第i行第j个数，通过找i-1行中的j-1和j元素相加来确定

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
            
        for ( int i = 1; i<numRows; i++){
            List<Integer> previous_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            for (int j=1; j<i; j++){
                row.add(previous_row.get(j-1)+previous_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}