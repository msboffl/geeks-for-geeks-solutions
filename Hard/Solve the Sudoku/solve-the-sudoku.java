//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    public static boolean isSafe(int grid[][],int row,int col,int digit){
        // For Row
        for(int j=0;j<9;j++){
            if(grid[row][j]==digit){
                return false;
            }
        }
        // For Column
        for(int i=0;i<9;i++){
            if(grid[i][col]==digit){
                return false;
            }
        }
        // For Grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(grid[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isgridSolve(int grid[][], int row, int col){
        // Base case
        if(row==9){
            return true;
        }
        // Recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(grid[row][col]!=0){
            return isgridSolve(grid, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(grid,row,col,digit)){  
                grid[row][col]=digit;
                if(isgridSolve(grid, nextRow, nextCol)){ // solution exists
                    return true;
                }
                grid[row][col]=0;
            }
        }
        return false;
    }
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return isgridSolve(grid,0,0);
        
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
           // System.out.println();
        }
    }
}