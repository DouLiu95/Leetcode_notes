//question

// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1

//思想： 使用广度优先，找到一个点 1， 开始对上下左右的点进行递归搜索，将找到的附近的1变为0
//注意在BFS方法里，先判断当前的input是否在范围内，然后判断是否是0，如果不在范围内或者=0，就直接返回空，反之可以进行下去

//什么是BFS what is BFS:
//1. start from the root
//2. fetch the first node, check is the target, if not, add this node's subnodes to the quene
//3. if the quene is empty, stop and return "no target"
//4. repeat step 2

class Solution {
    public int numIslands(char[][] grid) {
      
        int count = 0;
        
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length ;j++){
                if (grid[i][j] == '1'){
                    count +=1;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public void callBFS(char[][] grid, int i, int j){
        if ( i< 0 || i >= grid.length || j <0 || j>=grid[i].length||grid[i][j] == '0' )
            return;
        grid[i][j] = '0';
        callBFS(grid, i+1 ,j); // up
        callBFS(grid, i-1 ,j); // down
        callBFS(grid, i ,j+1); // left
        callBFS(grid, i ,j-1); // right
    }
}
